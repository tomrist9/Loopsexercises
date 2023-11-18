package SetMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, RuntimeException {
        File file= new File("C:\\Users\\hp\\IdeaProjects\\Loopsexercises\\people.json");


        try{
            Scanner sc=new Scanner(file);


            while (sc.hasNext())
                System.out.println(sc.nextLine());
        }catch (FileNotFoundException e){
            throw new RuntimeException(String.valueOf(file));
        }

    }
}
