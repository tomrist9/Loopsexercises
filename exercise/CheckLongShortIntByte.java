package exercise;

import java.util.Scanner;

public class CheckLongShortIntByte {
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        System.out.println("Enter numbers (enter 0 to stop:)");
        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");

                if(x>=-2147483648  && x<= 2147483647)System.out.println("* int");

                if(x>=-100000000000000L && x<= 100000000000000L)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}

