public class removeCharactersExceptAplhabets {
    public static void main(String[] args) {
        // define string and use method replaceAll through regex method
        String str = "hel1456lo56wor%^ld";
       str = str.replaceAll("[^a-zA-Z]" , "");
        System.out.println(str);
    }
}
