public class HumanWorker implements Sleepable, Workable, Eatable {

    @Override
    public void eatFood() {
        System.out.println("eatFood");
    }

    @Override
    public void doWork() {
        System.out.println("doWork");
    }

    @Override
    public void takeRest() {
        System.out.println("takeRest");
    }
    
}
