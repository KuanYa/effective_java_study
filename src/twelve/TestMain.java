package twelve;

public class TestMain{

    public static void main(String[] args) {
        CaseInsensitiveString string = new CaseInsensitiveString("Bfk");
        String s = "bfk";
        // 违反对称性 String 中equals 不知道区分大小写的字符串
        System.out.println(string.equals(s));
        System.out.println(s.equals(string));

    }

}
