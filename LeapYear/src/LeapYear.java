
package src;

public class LeapYear {

    public boolean isLeapYear(int year){
        if (year%400==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
