package OOPs.Pillers.AbstractExample;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(20);
        son.career("Doctor");
        son.partner("sushma",25);

        Daughter daughter = new Daughter(39);
        daughter.career("Coder");
        daughter.partner("Ramesh",31);

        Parent parent = new Son(12);
        parent.normal();

        Parent.hello();
        son.normal();
        System.out.println(parent.equals(daughter));
        System.out.println(parent == daughter);

//        Parent parent = new Parent(22);
    }
}
