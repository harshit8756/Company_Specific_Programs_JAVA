public class countTheSumOfNumberInString {
    public static void main(String[] args)
    {
        String str = "123Harsh45it8";
        int sum = 0;
        for (int i = 0; i < str.length(); i++)
        {
           if (Character.isDigit(str.charAt(i)))
           {
               sum = sum + Character.getNumericValue(str.charAt(i));
           }
        }
        System.out.println("The sum of the digit in the string are :- " + sum);
    }
}
