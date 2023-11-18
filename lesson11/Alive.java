package lesson11;

public interface Alive {

    void run();

    default void defaultMethod(){
        System.out.println("default method");
        privateMetghod();
    }
      private void privateMetghod(){
          System.out.println("private method");
      }

static void staticMethod(){
    System.out.println("static method");
}
}
