import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int width = sc.nextInt();
        int area = l*width;
        System.out.println(area);
    }
}
