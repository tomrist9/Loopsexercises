import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=sc.nextInt();
        if(isLeapYear(year)){
            System.out.println("It is a leap year.");
        }else {
            System.out.println("not a leap year");
        }


    }
    public static boolean isLeapYear(int year){

        if(year%4!=0){
            return false;
        }else if(year%100!=0){
            return false;
        }else if(year%400!=0){
            return false;
        }else{
            return true;
        }
    }
}
