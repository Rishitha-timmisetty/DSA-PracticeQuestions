class Student{
    String name;
    static String school;//static:common for all
    public static void changeSchool(){
        school="new";
    }
}
public class Oops {
    public static void main(String[] args) {
        Student.school ="TRR";
        Student student1=new Student();
        student1.name="tony";
        System.out.println(student1.school);
    }
}
//inheritance provides reusability
/*Types of inheritance:
 * single inheritance
 * multi-level inheritance
 * Hierarchial inheritance
 * Hybrid Inheritance(Mixed)
 * multiple inheritance(C++ ; in java: interfaces are used to implement this)
 * i.e In Java, it is not possible in classes, but possible in interfaces.
 * A class can extend 2 or more interfaces but not 2 or more classes.
 * /
/*Base class constructor is called first. Later the child class constructor
this is called constructor chaining. 
 */

/* */