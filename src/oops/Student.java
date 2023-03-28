package oops;

public class Student {
    String name;
    String prn;
    int rollNo;
    double percentage;
    String city;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rishi";
        s1.prn ="RKFL5665";
        s1.rollNo = 55;
        s1.percentage = 96.5;
        s1.city = "Pune";

        Student s2 = new Student();
        s2.name = "Varsha";
        s2.prn ="RKFL5663";
        s2.rollNo = 51;
        s2.percentage = 97.5;
        s2.city = "Mumbai";

        calculateAverage(s1.percentage,s2.percentage);
    }

    public static void calculateAverage(Double percentage1,
                                        Double percentage2){
        double average = (percentage1+percentage2)/2;
        System.out.println("Average : "+average);
    }
}
