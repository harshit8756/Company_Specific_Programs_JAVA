public class strongestNumber {
    public static void main(String[] args) {
        int n, i, fact, rem;
        n = 145;
        int sum = 0;
        int temp = n;
        while (n != 0) {
            i = 1;
            fact = 1;
            rem = n % 10;
            while (i <= rem) {
                fact = fact * i;
                i++;
            }
            sum = sum + fact;
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println(temp + " It is strongest number");
        } else {
            System.out.println(temp + " it is not a strongest number");
        }
    }
}
