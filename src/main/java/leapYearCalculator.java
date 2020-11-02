
public class leapYearCalculator {
public Integer yearInt;

leapYearCalculator(int year){
    this.yearInt= year;
}


    public static boolean isALeapYear(Integer year){

        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }


    }
}
