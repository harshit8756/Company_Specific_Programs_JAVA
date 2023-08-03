import java.lang.*;
import java.util.*;
public class reverseString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb=sb.reverse();
        System.out.println(sb);
    }
}
