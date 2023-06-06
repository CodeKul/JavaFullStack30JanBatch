package strings;

public class StringMethodsDemo {
    public static void main(String[] args) {
        //substring
        String str1 = "Hii Rushi,How are you?";
        System.out.println(str1.substring(4));
        System.out.println(str1.substring(4,10));

        //split
       String [] strArray= str1.split(",");
       for (String s :strArray)
        System.out.println(s);

       if (str1.startsWith("H"))
           System.out.println("HII");
       else
           System.out.println("Byee");

    }
}
