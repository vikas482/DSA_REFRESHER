public class LinearSearchMinValue2DArray {

    public static void main(String args[]){
        int target = 31;
        int num[][] = {{11,2,31,4},
                {1,3,4,5},
                {5,0,7}};
        int minValue = minValue(num,target);
        System.out.println("minValue="+minValue);
    }

    static int minValue(int arr[][], int target){
        //System.out.println(arr.length);
        if (arr.length == 0) {
            return -1;
        }
        int minValue = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i].length);
            for(int j=0;j<arr[i].length;j++)
                if(arr[i][j] < minValue ){
                    minValue = arr[i][j];
                }
        }
        return minValue;
    }

}
