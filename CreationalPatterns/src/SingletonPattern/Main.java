package SingletonPattern;

public class Main {
    public static void main(String[] args) throws Exception {
        Singleton singletonObject = Singleton.getSingletonInstance();

        singletonObject.print();
    }
}
