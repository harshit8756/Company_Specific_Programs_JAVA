public class palindromeString {
    public static void main(String[] args) {
        String str = new String("Radar");
        String reverse = "";
        for (int i = str.length()-1; i >=0 ; --i)
        {
            reverse =  reverse + str.charAt(i);
        }
        if(str.toLowerCase().equals(reverse.toLowerCase()))
        {
            System.out.println("it is palindrome");
        }
        else
        {
            System.out.println("it is not palindrome");
        }

    }
}
