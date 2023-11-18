package exercise;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {

    private String name;


    private String surname;


    private int age;


    private String gender;


    private String birthDate;

    public Person(String name) {
        this.name = name;


    }

    public Person(String name, String surname, int age, String gender, String birthDate) {
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }


    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("C:\\Users\\hp\\IdeaProjects\\Loopsexercises\\people.json");


        try{
            Scanner sc=new Scanner(file);
            List<String> Arraylist=new ArrayList<>();

            while (sc.hasNext())
                System.out.println(sc.nextLine());
        }catch (FileNotFoundException e){
            throw new RuntimeException(String.valueOf(file));
        }

    }

}