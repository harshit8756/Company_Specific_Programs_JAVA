public class lengthString2 {
    public static void main(String[] args) {
        String str = new String("harshit");
        int len= 0;
        char ch[] = str.toCharArray();
        for(char c : ch)
        {
            len++;
        }
        System.out.println(len);
    }
}
