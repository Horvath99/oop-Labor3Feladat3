package Labor12_3;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Process {
    private HashMap<Integer, Student> students = new HashMap<>();
    public Process(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] items = line.split(" ");
                int id = Integer.parseInt(items[0].trim());
                String firstname = items[1].trim();
                String lastname = items[2].trim();
                students.put(id, new Student(id, firstname, lastname));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
        public void SetMath(String fileName){
            try (Scanner scanner = new Scanner(new File(fileName))) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] items = line.split(" ");
                    int id = Integer.parseInt(items[0].trim());
                    Double math = Double.parseDouble(items[1].trim());
                    students.get(id).setMath(math);

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            };

        }
        public void SetRo(String fileName){
            try (Scanner scanner = new Scanner(new File(fileName))) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] items = line.split(" ");
                    int id = Integer.parseInt(items[0].trim());
                    Double rom = Double.parseDouble(items[1].trim());
                    students.get(id).setRom(rom);

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
        public void SetHun(String fileName){
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] items = line.split(" ");
                int id = Integer.parseInt(items[0].trim());
                Double hun = Double.parseDouble(items[1].trim());
                students.get(id).setHun(hun);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
        public int CountPassed(){
        int count=0;
            for(Map.Entry<Integer,Student> student:students.entrySet()){
                if(student.getValue().passed()==true){
                    count++;
                }
            }
            return count;

        }
        public void PrintFailed(){
            ArrayList<Student> failedStudents=new ArrayList<>();
            for(Map.Entry<Integer,Student> student:students.entrySet()){
                if(student.getValue().passed()==false){
                    failedStudents.add(student.getValue());
                }
            }
            failedStudents.sort(Student::compareTo);
            for(Student student:failedStudents){
                System.out.println(student.toString());
            }
        }

}

