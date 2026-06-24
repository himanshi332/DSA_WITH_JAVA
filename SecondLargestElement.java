public class SecondLargestElement{

    public static void main(String args[]){
        int arr[] = {3,1,4,7,7,5};
        int n = arr.length;
        int Largest = arr[0];
        int SecondLargest = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]> Largest){
                SecondLargest = Largest;
                Largest = arr[i];
            }
            else if(arr[i]> SecondLargest && Largest!= arr[i]){
                SecondLargest = arr[i];
            }
        }
           System.out.println(SecondLargest);
    }
}