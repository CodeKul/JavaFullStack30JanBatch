package strings;

/**
 * 1. By using equals()
 *          - compares the content of the string
 * 2. By using == Operator
 *          - compares the references
 * 3. By using compareTo()
 *          - compares the values lexicographically
 *               s1 == s2 : returns 0
 *               s1 > s3  : returns positive value
 *               s1 < s3 : returns negative value
 *
 *
 */
public class StringCompareDemo {
    public static void main(String[] args) {
        String str1 = "Codekul";
        String str2 = "Codekul";
        String str3 = new String("Codekul");
        String str4 = "Pune";
        String str5 = "PUNE";
        //equals method
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str4.equalsIgnoreCase(str5));
        //== operator

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str4==str5);

        //compare to
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str4));

    }
}
