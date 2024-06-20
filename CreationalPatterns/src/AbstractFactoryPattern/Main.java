package AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) throws Exception {
        AbstractFactory object = AbstractFactoryProducer.getProfessionOrTrainee(false);

        Profession doctorProfession = object.getProfession("Doctor");
        
        doctorProfession.print();
    }
}
