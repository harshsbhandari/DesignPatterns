package AbstractFactoryPattern;

public class ProfessionFactory extends AbstractFactory {
    
    @Override
    public Profession getProfession(String profession){
        if(profession == null || profession.equalsIgnoreCase(""))
            return null;
        if(profession.equalsIgnoreCase("Doctor"))
            return new DoctorProfession();
        else if(profession.equalsIgnoreCase("Engineer"))
            return new EngineerProfession();
        else if(profession.equalsIgnoreCase("Lawyer"))
            return new LawyerProfession();
        return null;
    }
}
