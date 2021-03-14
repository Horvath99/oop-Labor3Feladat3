package Labor4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
          //readFilePrintItsLineNumbered("Labor4/labor4_1_input.csv");
          ArrayList<Person> persons=readFromCSVFile("Labor4/labor4_1_input.csv");
          for(Person person: persons){
              System.out.println(person);
          }
    }
    public static void readFilePrintItsLineNumbered( String fileName ){
        Scanner scanner = null;
        try {
            scanner = new Scanner( new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int lineCounter=0;
        while(scanner.hasNextLine()){
            String line= scanner.nextLine();
            ++lineCounter;
            System.out.println(lineCounter+" "+line);
        }
    }
    public static ArrayList<Person> readFromCSVFile(String fileName){
        ArrayList<Person> persons=new ArrayList<>();
        Scanner scanner=null;
        try {
            scanner = new Scanner( new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Nem letezo allomany");
            return persons;
        }
        while(scanner.hasNextLine()){
            String line=scanner.nextLine();
            String[] items=line.split(",");
            String firstName=items[0].trim();
            String lastName=items[1].trim();
            int birthYear=Integer.parseInt(items[2].trim());
            persons.add(new Person(firstName,lastName,birthYear));
           // persons.add(new Person(items[0].trim()),items[1].trim(),Integer.parseInt(items[2].trim()));
        }
        return persons;

    }
}
