package Labor4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    private int length;
    private double elements[]=new double[length];

    public MyArray(int lenght) {

        this.length = lenght;
        elements=new double[lenght];
        this.elements=elements;
    }

    public MyArray(double elements[]) {

        this.elements = elements;
        int lenght=elements.length;
        this.length=lenght;
    }

    public MyArray(MyArray array) {
        this.length = array.length;
        this.elements = array.elements;
    }

    public MyArray(String fileName) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Nem letezo allomany");
            return;
        }

        int n = scanner.nextInt();
        double[] integers=new double[n];
        for(int i=0;i<n;i++){
            integers[i]=scanner.nextInt();
        }
        this.length=n;
        this.elements=integers;

    }
    public void fillRandom(double a,double b){
        Random random=new Random();
        for(int i=0;i<length;i++){
            double randomValue = a + (b - a) * random.nextDouble();
            elements[i]=randomValue;
        }
    }
    public double Mean(){
        double osszeg=0;
        for(int i=0;i<length;i++){
            osszeg+=elements[i];
        }
        return osszeg/length;
    }
    public double stddev(){
        double mean,SD=0;
        mean=Mean();
        for(double num:elements){
            SD+=Math.pow(num-mean,2);
        }
        return Math.sqrt(SD/length);
    }
    public void sort(){
        double csere;
        for(int i=0;i<length;i++){
            for(int j=0;j<length-1;j++){
                if(elements[j]> elements[j+1]){
                    csere=elements[j+1];
                    elements[j+1]=elements[j];
                    elements[j]=csere;
                }
            }
        }
    }
    public void print(String arrayName){
        System.out.print(arrayName+":");
        for(int i=0;i<length;i++){
            System.out.print(elements[i]+"  ");
        }
    }
    @Override
    public String toString() {
        return "MyArray{" +
                "lenght=" + length +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
