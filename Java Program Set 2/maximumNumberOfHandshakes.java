import java.util.Scanner;

public class maximumNumberOfHandshakes {
    public static void main(String[] args) {
        System.out.print("Enter Number of persons who want to handshake : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = n*(n-1)/2;
        System.out.println("The total number of handshakes are : " + result);
    }
}
