package lesson9;

public class Main {
    public static void main(String[] args) {
        Pet cat;
        cat = new Pet();
        cat.nickname="Sisi";
        cat.species="ss";
        cat.trickLevel=56;
        cat.habits= new String[]{"sleeping", "lyes"};

        Human human =new Human();
        human.name="John";
        human.surname="Smith";
        human.pet=cat;

        cat.eat();
        cat.respond();
        cat.foul();
        System.out.println(cat.nickname);

    }


    }


