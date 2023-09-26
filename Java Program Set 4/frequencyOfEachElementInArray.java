public class frequencyOfEachElementInArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,2,6,6,3,4};
        // initialize visited array to store the frequency of the element whicha are present in array arr[]
        int[] visitedArray = new int[arr.length];

        int visited = -1; // it gives false statement where they visited on the same element in array arr[]

        for (int i = 0; i < arr.length; i++)
        {
            int count = 1;
            for (int j = i+1 ; j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    count ++;
                    visitedArray[j] = visited;
                }
            }
            if(visitedArray[i] != visited)
            {
                visitedArray[i] = count ;
            }

        }

        // to print the visited array
        for (int i = 0; i < visitedArray.length; i++)
        {
            if(visitedArray[i] != visited)
            {
                System.out.println("Frequency of -" +  arr[i] + ":" + visitedArray[i] );
            }
        }
    }
}
