package AbstractFactoryPattern;

public class ProfessionTraineeFactory extends AbstractFactory {
    
    @Override
    public Profession getProfession(String profession){
        if(profession == null || profession.equalsIgnoreCase(""))
            return null;
        if(profession.equalsIgnoreCase("Doctor"))
            return new DoctorProfessionTrainee();
        else if(profession.equalsIgnoreCase("Engineer"))
            return new EngineerProfessionTrainee();
        else if(profession.equalsIgnoreCase("Lawyer"))
            return new LawyerProfessionTrainee();
        return null;
    }

}
