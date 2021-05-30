package Labor9_1;

public class DateUtil {
    public static boolean leapYear(int year){
        if(year%4==0 && year%100==0 && year%400==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isValidDate(int year, int month, int day){
        if(year>0 && year<=2021){
            if(month>0 && month<=12 && month!=2){
                if(day>0 && day<31){
                    return true;
                }
                else{
                    return false;
                }
            }
            else if(month==2){
                if(leapYear(year)==true) {
                    if (day > 0 && day <= 29) {
                        return true;
                    } else {
                        return false;
                    }
                }
                else{
                    if (day > 0 && day <= 28) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}

