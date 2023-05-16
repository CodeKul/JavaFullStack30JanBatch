package encapsulation;

public class Person {
    private Integer id;
    private String username = "purva@123";
    private   String email;
    private String mobile;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if(this.getMobile().length()>10)
            System.out.println("Not a valid");
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


class PersonImpl {
    public static void main(String[] args) {
        Person person = new Person();
        person.setEmail("purva@gmail.com");
        person.setMobile("9856344556");
       // person.setName( "Purva");
        person.setPassword("123456");
        person.setId(1);

        System.out.println("Name "+person.getUsername());
        System.out.println("Mobile "+person.getMobile());
        System.out.println("Email "+person.getEmail());
       // System.out.println("Password "+person.getPassword());
    }
}