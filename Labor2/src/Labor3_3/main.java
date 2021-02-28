package Labor3_3;

import java.sql.SQLOutput;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        int HitelesEvek=0,osszesEv=0;
      for(int i=0;i<100;i++){
          Random rand = new Random();
          int year=1+ rand.nextInt(2021);
          int month=1+rand.nextInt(12);
          int day=1+ rand.nextInt(31);
          MyDate newDate=new MyDate(year,month,day);

          if(DateUtil.isValidDate(newDate.getYear(),newDate.getMonth(),newDate.getMonth())){
              System.out.println(newDate.toString());
              HitelesEvek++;
          }
          osszesEv++;

      }
        System.out.println("Osszes generalt evek szama:"+osszesEv);
        System.out.println("Helyes evek szama:"+HitelesEvek);

    }
}
