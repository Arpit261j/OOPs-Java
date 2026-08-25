package OOPs.Pillers.Inheritance.SpeciesExample;

public class InheritanceMain {
    public static void main(String[] args) {
        Human human = new Human(27,'F');
        System.out.println(human.age + " " + human.gender);

        Species human1 = new Human();
        System.out.println(human1.age);
    }
}
