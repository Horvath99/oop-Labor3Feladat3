package Labor2_2;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.SortedMap;

public class main {
    public static void main(String[] args) {
        Rectangle[] rectangles=new Rectangle[10];
        for (int i=0;i<10;i++){
            Random rand = new Random();
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10) ;
            rectangles[ i ] = new Rectangle(length, width);
        }
        double totalArea=0,totalPerimeter=0;
        for (int i=0;i<10;i++){
            System.out.println("Rectancgle "+i+":");
            System.out.println(" Widht: "+rectangles[i].getWidht());
            System.out.println(" Lenght: "+rectangles[i].getLenght());
            System.out.println(" Area:"+rectangles[i].area());
            System.out.println(" Perimeter:"+rectangles[i].perimeter());
            totalArea+=rectangles[i].area();
            totalPerimeter+=rectangles[i].perimeter();
        }
        System.out.println("Total area of rectangles:"+totalArea);
        System.out.println("Total perimeter of rectangles:"+totalPerimeter);
    }
}
