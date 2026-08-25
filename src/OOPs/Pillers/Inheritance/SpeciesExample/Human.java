package OOPs.Pillers.Inheritance.SpeciesExample;

public class Human extends Species{

    char gender;

    Human() {
    }
    Human(int age, char gender) {
        super(age);
        this.gender = gender;
    }
}
