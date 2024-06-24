package InterfaceSegregation.Wrong;

public class RobotWorker implements Worker {

    @Override
    public void doWork() {
        System.out.println("doWork");
    }

    @Override
    public void takeRest() {
        System.out.println("takeRest");
    }

    @Override
    public void eatFood() {
        System.out.println("eatFood");
    }

}
