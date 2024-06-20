package FactoryPattern;

public interface Profession {
    void print();
}

// Provide it a 'profession' as string to ProfessionFactory, accordingly it
// creates object of the required class

// ProfessionFactory (class)
// Profession (interface)
// Below 3 implements Profession
// Lawyer Doctor Enginerer