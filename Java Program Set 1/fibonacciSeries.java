// We had to calculate sum of last three terms for Fibonacci series. If n>3
//till n<=3 , we will print that number and after that print sum of last three digits of Fibonacci series .

// company question

public class fibonacciSeries {
    public static void main(String[] args) {
        int n = 4;
        if (n<=0)
        {
            System.out.println("valid");
        }
        else if (n<=3)  // print the series of the number
        {
            for (int i = 1; i <=3 ; i++)
            {
                System.out.println(fibonacci(n));
            }
        }
        else
        {
            // print the sum of the last three of the fibonacci series
            int a = 1;
            int b = 1;
            int c = 2;
            int sum = 0;
            for (int i = 4; i <=n ; i++)
            {
                 sum = a+b+c;
                 a=b;
                 b=c;
                 c=sum;
                System.out.println(sum);
            }
        }
    }
    static int fibonacci(int n)
    {
        if(n<=1)
        {
            return n;
        }
        else
        {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
