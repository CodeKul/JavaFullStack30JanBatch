package statickeyword;

public class Student {
    int rno;
    String name;
    String std;
   static String schoolName = "RRV";

    public Student(int rno, String name, String std,String schoolName) {
        this.rno = rno;
        this.name = name;
        this.std = std;
        this.schoolName = schoolName;
    }
    void show(){
        System.out.println("Rno "+rno +" Name "+name +" Std "+std + " School Name "+schoolName);
    }
}
class StudentImpl{
    public static void main(String[] args) {
        Student s1 = new Student(1,"Kedar","5th","RRV");
        Student s2 = new Student(2,"Aman","6th","DPS");
        Student s3 = new Student(3,"Rekha","7th","DPS");

        s1.show();
        s2.show();
        s3.show();
    }
}