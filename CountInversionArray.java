

public class CountAnInversionArray {
    static int arr[] = new int[] {1,20,6,4,5};

    public static int inversionArray(int n){
        int inv_count = 0;
        for(int i =0; i<n-1; i++)
         for (int j= i+1 ; j<n; j++)
                if(arr[i]>arr[j])
                inv_count++;
     return inv_count; 
        
    }
    public static void main(String [] args){
        System.out.println("No. of inversions are " +inversionArray(arr.length));
    }
}
