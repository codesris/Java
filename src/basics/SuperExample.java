package src.basics;

class Person{
    String first;
    String last;

    Person(String first, String last){
        this.first = first;
        this.last = last;
    }

    void showName(){
        System.out.println(this.first + " " + this.last);
    }
}

class Apprentice extends Person{
    double gpa;

    Apprentice(String first, String last, double gpa){
        // this.first = first;
        // this.last = last;
        super(first,last);
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first + "'s gpa is: " + this.gpa);
    }
}

class Employee extends Person{
    int salary;

    Employee(String first, String last, int salary){
        super(first, last);
        this.salary = salary;
    }

    void showSalary(){
        System.out.println(this.first + " earns $" + this.salary);
    }
}

public class SuperExample {
    public static void main(String[] args) {
        // super = refers to the parent class (subclass <- superclass)
        //          Used in constructors and method overriding
        //          Calls the parent constructor to initialize attributes

        Person person = new Person("Cha", "Sris");
        Apprentice app = new Apprentice("Srisan", "Chaudhary", 3.26);
        Employee employee = new Employee("Spongebob", "Squarepants", 5000);

        person.showName();
        System.out.println(app.gpa);
        employee.showSalary();
    }
    
}
