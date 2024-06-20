package FactoryPattern;

public class ProfessionFactory {
    public Profession getProfession(String profession) {
        if (profession.isEmpty() || profession == null)
            return null;
            
        if(profession.equalsIgnoreCase("Doctor")) {
            return new DoctorProfession();
        }
        else if(profession.equalsIgnoreCase("Engineer")) {
            return new EngineerProfession();
        }
        else if(profession.equalsIgnoreCase("Lawyer")) {
            return new LawyerProfession();
        }
        
        return null;
    }
}
