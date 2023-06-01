package strings;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Good ");
        stringBuffer.append("afternoon");
        stringBuffer.append("!!!");
        stringBuffer.insert(0,"!!!");
        stringBuffer.replace(1,3,"123");
        stringBuffer.delete(1,3);
        System.out.println(stringBuffer);
    }
}
