package Unit2.Switch;

public class StringVariation {
    public static void main(String[] args) {
        String str = "Hi User";
        String str2 = """
                                                                Hi User,
                                                                Welcome to Java
                      """;
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
    }
}
