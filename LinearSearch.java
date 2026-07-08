public class LinearSearch{
    public static int linearSearch(int arr[], int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }

public static void main(String args[]){
    int arr[] = {10,20,30,40,50};
    int num = 40;
    int result = linearSearch(arr, num);
    System.out.println(result);
}

}