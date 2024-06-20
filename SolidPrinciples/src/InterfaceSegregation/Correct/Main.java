public class Main {
    public static void main(String[] args) {
        Workable humanWorker = new HumanWorker();
        humanWorker.doWork();

        Eatable humanEater = new HumanWorker();
        humanEater.eatFood();

        Sleepable humanSleeper = new HumanWorker();
        humanSleeper.takeRest();

        Workable robotWorker = new RobotWorker();
        robotWorker.doWork();
    }
}