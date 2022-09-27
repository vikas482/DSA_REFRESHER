/*
Linear Algorithm
==================
Linear Search is defined as a sequential search algorithm that starts at one
end and goes through each element of a list until the desired element is found, otherwise the search continues till the end of the data set. It is the easiest searching algorithm.
Time Complexity  - How time grows as input grows
Best Case - O(1)
Worst Case - O(N) whereas N is Size of Array
Space Complexity - How much space grows as input grows
O(1) -  means just 1 variable/ array is used, so it is O(1) or Constant space complexity.
*/

public class LinearSearch {


    public static void main(String args[]){

        int target = 3;
        int num[] = {11,2,31,4};
        int result = linearSearch(num,target);

        if(result!=-1){
            System.out.println("Element found at "+result+" position");
        }else{
            System.out.println("Element not found in the array list");
        }
    }

    static int linearSearch(int arr[], int target){

        if (arr.length == 0) {
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }

}
