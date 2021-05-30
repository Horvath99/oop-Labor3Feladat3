package Labor9_1;

public class MyDate implements Comparable<MyDate>{
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
    public int compareTo(MyDate date){
        if(this.year!=date.year){
            return this.year-date.year;
        }
        if(this.month!=date.month){
            return this.month-date.month;
        }
        if(this.day!=date.day){
            return this.day- date.day;
        }
        return 0;
    }
    public String toString(){
        return "MyDate{"
                +"year="+year+
                ", month="+month+
                ", day="+day+
                "}";
    }
}
