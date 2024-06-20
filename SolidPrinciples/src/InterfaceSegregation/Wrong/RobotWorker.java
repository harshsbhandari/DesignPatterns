package InterfaceSegregation.Wrong;

public class RobotWorker implements Worker {

    @Override
    public void doWork() {
        System.out.println("doWork");
    }

    // This is wrong below, Robot can just do work, it does not need food and sleep
    // The Interface Segregation Principle (ISP) states that no user should be forced to depend on methods it does not use. This means that instead of having one large interface, we should split it into smaller, more specific interfaces so that users only need to know about the methods that are of interest to them.

    @Override
    public void takeRest() {
        System.out.println("takeRest");
    }

    @Override
    public void eatFood() {
        System.out.println("eatFood");
    }
    
}
