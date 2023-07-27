import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double pi = 3.14;
        double area = pi*r*r;
        System.out.println(area);

    }
}
