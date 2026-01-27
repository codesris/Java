package src.basics;

public class ConstructorsExample {
    public static void main(String[] args) {
        //constructors = A special method to initialize objects
        //              You can pass arguments to a constructors
        //              and setup intial values

        Student student1 = new Student("Spongebob", 30, 3.2);
        Student student2 = new Student("Patric", 34, 1.2);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        student1.study();
        student2.study();

    }
}
