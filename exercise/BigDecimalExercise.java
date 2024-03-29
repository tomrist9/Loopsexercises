package exercise;

import java.util.*;
public class BigDecimalExercise {


    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        Arrays.sort(s, 0, n, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                BigDecimalExercise bd1 = new BigDecimalExercise(s1);
                BigDecimalExercise bd2 = new BigDecimalExercise(s2);
                return bd2.compareTo(bd1);
            }
        });

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
