public class LeapYears {
    public static boolean isLeapYear (int number){
        boolean isThisALeapYear = false;

        if ((number % 4 == 0) && (number % 100 !=0) ||(number % 400 == 0)) {
            isThisALeapYear = true;
            }
        return isThisALeapYear;
    }


}
