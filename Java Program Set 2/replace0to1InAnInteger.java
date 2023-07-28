import java.util.Scanner;

public class replace0to1InAnInteger {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = Integer.toString(num);
        int length = str.length();
        String result = " ";
        for (int i = 0; i < length; i++)
        {
           if(str.charAt(i) == '0')
           {
               result = result + '1';
           }
           else
           {
               result = result + str.charAt(i);
           }
        }
        System.out.println(result);
    }
}
