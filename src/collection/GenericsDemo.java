package collection;
class Person<T>{
    private T mobileNo;


    public T getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(T mobileNo) {
        this.mobileNo = mobileNo;
    }
}
public class GenericsDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setMobileNo(545454);
        person.setMobileNo("+918554654654");
    }
}
