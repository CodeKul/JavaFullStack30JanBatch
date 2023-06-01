package strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Good");
        stringBuilder.append(" Afternoon");
        stringBuilder.insert(0,"!!!");
        stringBuilder.replace(1,3,"123");
        stringBuilder.delete(1,3);
        System.out.println(stringBuilder);
    }
}
