public class LinearSearchIn2DArrays {

    public static void main(String args[]){
        int target = 31;
        int num[][] = {{11,2,31,4},
                        {1,3,4,5},
                        {5,6,7}};
        String result = linearSearch(num,target);
        System.out.println(result);
    }

    static String linearSearch(int arr[][], int target){
        //System.out.println(arr.length);
        if (arr.length == 0) {
            return "Array length is zero";
        }

        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i].length);
            for(int j=0;j<arr[i].length;j++)
            if(arr[i][j]==target){
                return ""+i+","+j;
            }
        }
        return "Not Found";
    }


}
