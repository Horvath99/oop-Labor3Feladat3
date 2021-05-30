package Labor10_2;

import Labor9_1.DateUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintStream printStream;
        try{
         printStream=new PrintStream("Labor10/warning.csv");
        }catch (FileNotFoundException e){
            System.out.println("Can't create file");
            e.printStackTrace();
            return;
        }
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("Labor10/bemenet.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Can't open file");
            return;
        }

        while (scanner.hasNextLine()) {
            int credit;
            String line = scanner.nextLine();
            String[] items = line.split(",");
            if(items.length<7){
                System.out.println("INCOMPLETE LINE:"+Arrays.toString(items));
                continue;
            };
            try{
                 credit=Integer.parseInt(items[3]);
            }catch (NumberFormatException e){
                System.out.println("NUMBER FORMAT EXCEPTION:"+items[3]);
                continue;
            }
            int year=0,month=0,day=0;
            try{
                 year=Integer.parseInt(items[4]);
            }catch (NumberFormatException e){
                System.out.println("NUMBER FORMAT EXCEPTION:"+items[4]);
            }
            try{
                 month=Integer.parseInt(items[5]);
            }catch (NumberFormatException e){
                System.out.println("NUMBER FORMAT EXCEPTION:"+items[5]);
            }
            try{
                 day=Integer.parseInt(items[6]);
            }catch (NumberFormatException e){
                System.out.println("NUMBER FORMAT EXCEPTION:"+items[6]);
            }
            if(!DateUtil.isValidDate(year,month,day)){
                System.out.println("INVALID DATE:"+items[4]+" "+items[5]+" "+items[6]);
            }
            else{
                continue;
            }
            if(credit<30){
                printStream.println(items);
            }
            else{
                continue;
            }

        }
    }

}
