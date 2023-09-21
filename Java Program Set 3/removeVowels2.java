public class removeVowels2 {
    public static void main(String[] args) {
        // By using regular expression we remove the vowels from the string
        String str = new String("harshit");
        System.out.println(remove(str));

    }

    static String remove(String str)
    {
        return str.replaceAll("[aeiouAEIOU]" , "");
    }
}
