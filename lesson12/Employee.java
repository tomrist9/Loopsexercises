package lesson12;

public class Employee {


        static int bodyPart1[] = {1, 2, 3, 4};
        static int bodyPart2[] = {5, 6, 7, 8};
        static int bodyPart3[] = {9, 10, 11, 12};
        static int bodyPart4[] = {13, 14, 15, 16};

        public static void main(String[] args) {
     start();
        }


        public static void start(){
        for(int i=0; i<bodyPart1.length;i++){
            int first =bodyPart1[i];
            System.out.print(first+",");
            }
            System.out.println();
        for(int i=0; i<bodyPart2.length; i++){
            int a = bodyPart2.length-(1+i);
            int second=bodyPart2[a];
            System.out.print(second+",");
            }
            System.out.println();
        for(int i=0; i<bodyPart3.length;i++){
            int third=bodyPart3[i];
            System.out.print(third+",");
        }
            System.out.println();
       for(int i=0; i<bodyPart4.length;i++){
           int b= bodyPart4.length-(1+i);
           int fourth=bodyPart4[b];
           System.out.print(fourth+",");
       }


        }
}