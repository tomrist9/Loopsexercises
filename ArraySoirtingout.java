import java.util.Arrays;

public class ArraySoirtingout {
    public static void main(String[] args) {
        int[]number={5, -2, -9,1,3};

        for(int i=0;i< number.length-1;i++){
            for (int j=0;j< number.length-1-i;j++){
                if(number[j]>number[j+1]){
                    int temp=number[j];
                    number[j]=number[j+1];
                    number[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array:"+ Arrays.toString(number));
    }
}
