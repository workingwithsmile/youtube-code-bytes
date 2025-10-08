class Solution {
    public void sort012(int[] arr) {
       int low = 0, high = arr.length-1, mid = 0, temp;
       while(mid<=high) {
           if(arr[mid]==0){
               temp = arr[low];
               arr[low] = arr[mid];
               arr[mid] = temp;
               low+=1;
               mid+=1;
            }
            else if(arr[mid]==1){
                mid+=1;
            }
            else{
                temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high-=1;
            }
        }
    }
}