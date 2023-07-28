public class pyramidStarsPattern {
    public static void main(String[] args) {
        int n =5;
        int row,stars,spaces;
        for (row = 1; row <= n; row++)
        {
           for(spaces = 1 ; spaces <=n-row ; spaces++ )
           {
               System.out.print(" ");
           }
           for(stars = 1; stars<=row ; stars++)
           {
//               System.out.print("* ");
                 System.out.print(stars+" ");
           }
            System.out.println();
        }
    }
}
