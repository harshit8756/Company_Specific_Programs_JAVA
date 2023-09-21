import java.util.Scanner;

public class toggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.next();
        String result = "";
        for (int i = 0; i < str.length(); i++)
        {
           if(Character.isUpperCase(str.charAt(i)))
           {
               result = result + Character.toLowerCase(str.charAt(i));
           }
           else
           {
               result = result + Character.toUpperCase(str.charAt(i));
           }
        }
        System.out.println("The Toggle String is : " + result);
    }

}
