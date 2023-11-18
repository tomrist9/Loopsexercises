import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[]arr=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int result=countNegativeSubarrays(arr);
        System.out.println(result);

        byte b=5;
      
    }


      public static int countNegativeSubarrays(int[]arr){
        int count=0;
        int length=arr.length;
        for(int i=0; i<arr.length; i++){
            int subarraySum=0;
            for(int j=0; j<arr.length; j++){
                subarraySum+=arr[j];
                if (subarraySum < 0) {
                    count++;
                }
            }
        }

          return count;
      }
}





