package SingletonPattern;

public class Singleton {
    // 1. Static variable
    private static Singleton singletonObject = new Singleton();

    // 2. Private constructor
    private Singleton() {
    }
    
    // 3. Getter method returning Singleton object
    public static Singleton getSingletonInstance() {
        return singletonObject;
    }
    
    public void print() {
        System.out.println("Hi I am print() inside singleton class");
    }
}
