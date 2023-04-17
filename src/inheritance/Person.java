package inheritance;

public class Person {
    int id = 1;
    String name = "Anuja";

}
class Student extends Person{
    float totalPercentage = 98.5f;
}
class PersonImpl{
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("*****Student Details******");
        System.out.println("Id : "+student.id);
        System.out.println("Name : "+student.name);
        System.out.println("Percentage : "+student.totalPercentage);
    }
}