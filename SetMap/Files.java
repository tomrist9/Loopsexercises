package SetMap;

import java.io.*;
public class Files {




        public static void main(String args[]) throws IOException {
File file = new File("C:\\Users\\hp\\IdeaProjects\\Loopsexercises\\people.json");
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.canExecute());
            file.createNewFile();
        }
}