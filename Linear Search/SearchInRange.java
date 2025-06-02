public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {12, 21, 43, -4, -5, 32, 33};
        int target = 43;
        System.out.println(linearSearch(arr, target, 1, 4));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        //run a for loop
        for(int index = start; index <= end; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        // this line will execute if none of the return statement above have executed
        // hence the target not found
        return -1;
    }
}
