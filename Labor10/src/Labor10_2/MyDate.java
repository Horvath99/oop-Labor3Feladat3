package Labor10_2;

import Labor9_1.DateUtil;

public class MyDate {
    private int year,month,day;
    public MyDate(int year,int month,int day){
        if(DateUtil.isValidDate(year,month,day)){
            this.year=year;
            this.month=month;
            this.day=day;
        }
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public String toString(){
        return "MyDate{"
                +"year="+year+
                ", month="+month+
                ", day="+day+
                "}";
    }
}
