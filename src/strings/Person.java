package strings;

public final class Person {
    private final String panNo;

    public Person(String panNo){
        this.panNo = panNo;
    }

    public String getPanNo(){
        return panNo;
    }
}

class PersonImpl{
    public static void main(String[] args) {
        Person p1 = new Person("AMDPE5204P");
        System.out.println(p1.getPanNo());
    }
}