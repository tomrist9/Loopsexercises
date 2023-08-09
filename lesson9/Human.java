package lesson9;

import java.util.Arrays;

public class Human {
    public String name;
    public String surname;
    public int dateofbirth;
    public int IQlevel;

    public Pet pet;
    public Human mother;
    public Human father;

    public String[][] schedule;

    public void greetPet() {
        System.out.printf("Hello, %s\n", pet.nickname);
    }

    public void describePet() {

        System.out.printf("I have a %s, he is %s years old, he is [very sly", pet.species);

    }

    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateofbirth=" + dateofbirth +
                ", IQlevel=" + IQlevel +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(schedule) +
                '}';


    }
}
