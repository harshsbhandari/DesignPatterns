package InterfaceSegregation.Wrong;

public class Main {
    public static void main(String[] args) {
        Worker human = new HumanWorker();
        human.doWork();
        human.eatFood();
        human.takeRest();

        Worker robot = new RobotWorker();
        robot.doWork();
        robot.eatFood(); // Not relevant for robots
        robot.takeRest(); // Not relevant for robots
    }
}