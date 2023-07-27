public class countNumberOfDigits {
    public static void main(String[] args) {
        // just eliminate last digit and immediately increase the count variable
        int num = 123456789;
        int count  = 0;
        while(num>0)
        {
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}
