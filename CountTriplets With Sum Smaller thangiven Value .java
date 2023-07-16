 //Simple Java program to count triplets with sum smaller
// than a given value
 
class Test
{
    static int arr[] = new int[]{5, 1, 3, 4, 7};
     
    static int countTriplets(int n, int sum)
    {
        // Initialize result
        int ans = 0;
      
        // Fix the first element as A[i]
        for (int i = 0; i < n-2; i++)
        {
           // Fix the second element as A[j]
           for (int j = i+1; j < n-1; j++)
           {
               // Now look for the third number
               for (int k = j+1; k < n; k++)
                   if (arr[i] + arr[j] + arr[k] < sum)
                       ans++;
           }
        }
      
        return ans;
    }
     
    // Driver method to test the above function
    public static void main(String[] args)
    {
        int sum = 10;
        System.out.println(countTriplets(arr.length, sum));
    }
}
