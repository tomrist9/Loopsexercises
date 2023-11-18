package lesson11;

public class Human implements Alive {

    @Override
    public void run() {
        System.out.println("Human is running");
    }
    public void read(){
        System.out.println("Human is reading");

    }
}

