
import java.util.Arrays;
class FindPair 
{

    public static Boolean findPair(int arr[],int n){

        Arrays.sort(arr);
         int size = arr.length;

        int i =0,j=1;
    while (i < size && j < size)
        {
            if( i!= j && (arr[j]-arr[i]==1) || (arr[i]-arr[j]==n) )
        {
            System.out.print("Pair found" +"("+arr[i]+","+arr[j]+")");
            return true;
        } 
        else if(arr[j] - arr[i] < 1)
        j++;
        else
        i++;
    }
    System.out.println("No such pair found");
    return false;
}
        
  public static void main (String args[]){
     int arr[] = {1,8,30,40,100};
     int n = -60;
     findPair(arr, n);
  }
}
