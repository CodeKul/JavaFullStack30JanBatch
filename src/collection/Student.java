package collection;

public class Student {
    private String name;
    private String mobile;

    public Student(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    @Override
    public int hashCode() {
        int hashcode = (name.concat(mobile)).hashCode();
        System.out.println("Hash code name: "+name.hashCode());
        System.out.println("Hash code mobile: "+mobile.hashCode());
        return hashcode;
    }

    public static void main(String[] args) {
        Student student = new Student("Trupti","9865321453");
        System.out.println("Get Hashcode "+student.hashCode());
    }
}
