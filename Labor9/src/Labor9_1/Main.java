package Labor9_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyDate> myDateArrayList=new ArrayList<>();
        int count=0;
        while(count!=10){
            Random rand = new Random();
            int year=1+ rand.nextInt(2022);
            int month=1+rand.nextInt(12);
            int day=1+ rand.nextInt(31);
            MyDate newDate=new MyDate(year,month,day);
            if(DateUtil.isValidDate(newDate.getYear(), newDate.getMonth(),newDate.getDay())){
                myDateArrayList.add(newDate);
                count++;
            }
        }
        for(MyDate date:myDateArrayList){
            System.out.println(date.toString());
        }
        Collections.sort(myDateArrayList,MyDate::compareTo);
        System.out.println();
        for(MyDate date:myDateArrayList){
            System.out.println(date.toString());
        }
    }

}
