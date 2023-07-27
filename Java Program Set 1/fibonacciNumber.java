public class fibonacciNumber {
    public static void main(String[] args) {
        int n = 10;
        int a,b,sum;
        a=0;
        b=1;
        sum =0;
        for(int i=2;i<n;i++)
        {
            sum = a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }
}
