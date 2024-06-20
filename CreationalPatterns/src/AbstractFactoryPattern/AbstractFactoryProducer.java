package AbstractFactoryPattern;

public class AbstractFactoryProducer {
    public static AbstractFactory getProfessionOrTrainee(boolean isProfessionTrainee) {
        if (isProfessionTrainee) {
            return new ProfessionTraineeFactory();
        }
        else {
            return new ProfessionFactory();
        }
    }
}
