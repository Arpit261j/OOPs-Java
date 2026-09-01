package OOPs.Pillers.ComparingObjects;

public class Student implements Comparable<Student> {
    String name;
    float marks;

    public Student() {

    }

    public Student(String name, float marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " " +marks;
    }

    @Override
    public int compareTo(Student o) {
        return (int)(this.marks - o.marks);
    }
}
