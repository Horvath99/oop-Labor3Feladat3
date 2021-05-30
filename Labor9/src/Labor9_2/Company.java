package Labor9_2;

import Labor9_1.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Employee> employees;

    public Company(String name) {
        this.name = name;
        employees=new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void hire(Employee employee){
        employees.add(employee);
    }
    public void hireaAll(String fileName){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Nem letezo allomany");
            return;
        }
        Employee employee=null;
        Manager manager=null;
        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            String[] items = line.split(",");
            String firstName=items[0].trim();
            String lastName=items[1].trim();
            double salary=Double.parseDouble(items[2].trim());
            int year=Integer.parseInt(items[3].trim());
            int month=Integer.parseInt(items[4].trim());
            int day=Integer.parseInt(items[5].trim());
            if(items.length==7){
                String department=items[6].trim();
                employees.add(new Manager(firstName,lastName,salary,new MyDate(year,month,day),department));
            }
            else{
                employees.add(new Employee(firstName,lastName,salary,new MyDate(year,month,day)));
            }
        }
    }
    public void fire(int index){
        employees.remove(index);
    }
    public void printAll(PrintStream ps){
            ps.println(this.name);
            for(Employee employee:employees){
                ps.println(employee);
            }
    }
    public void printManagers(PrintStream ps){
         for(Employee employee:employees){
             if(employee.getClass()==Manager.class){
                 ps.println(employee);
             }
         }
    }
    public void SortByComparator(Comparator<Employee> comparator){
        employees.sort(comparator);
    }

}
