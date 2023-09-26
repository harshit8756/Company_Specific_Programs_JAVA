public class removeSpacesFromString {
    public static void main(String[] args) {
        String str = "har shit";
        str=str.replaceAll("\\s" , "");
        System.out.println(str);
    }
}
