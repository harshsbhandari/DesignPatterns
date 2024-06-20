package FactoryPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Get input from user
        Scanner sc = new Scanner(System.in);
        String getProfessionFromUser = sc.nextLine();
        sc.close();

        // Creating the object of Factory
        ProfessionFactory professionFactory = new ProfessionFactory();

        // Asking factory to give an object of given type 
        // (ie : value passed in the parameter)
        Profession profession = professionFactory.getProfession(getProfessionFromUser);

        profession.print();
    }
}
