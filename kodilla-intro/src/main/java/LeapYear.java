public class LeapYear {
    public static void main(String[] args) {
        int year = 1969;
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear) {
            System.out.println("It's a leap year!");
        }
        else {
            System.out.println("It's not a leap year!");
        }
    }
}