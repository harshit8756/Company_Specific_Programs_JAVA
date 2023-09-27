public class removeBracketFromTheAlgebricExpression {
    public static void main(String[] args) {
        String str ="(a+b) * c";
        str = str.replaceAll("[(){}]" , "");
        System.out.println(str);
    }
}
