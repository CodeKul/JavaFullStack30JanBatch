package inheritance;

public class Human {
    int id = 1;
    String name = "Rupali";
    String address = "Pune";
    double salary = 50000;
}

class Engineer extends Human{
    String branch = "Computer Science";
}

class Doctor extends Human{
    String specialization = "MD";
}

class HumanImpl {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        System.out.println("Id "+engineer.id);
        System.out.println("Name "+engineer.name);
        System.out.println("Address "+engineer.address);
        System.out.println("Salary "+engineer.salary);
        System.out.println("Branch "+engineer.branch);
        Doctor doctor = new Doctor();

        System.out.println("Id "+doctor.id);
        System.out.println("Name "+doctor.name);
        System.out.println("Address "+doctor.address);
        System.out.println("Salary "+doctor.salary);
        System.out.println("Specialization "+doctor.specialization);
    }
}