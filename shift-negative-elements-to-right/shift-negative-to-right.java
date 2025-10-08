// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        int A[] = new int[arr.length];
        int i,index = 0;
        for(i=0;i<arr.length;i++){
            if (arr[i]>=0){
                A[index++] = arr[i];
            }
        }
        if (index==0 || index ==arr.length-1){
            return;
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]<0){
                A[index++]=arr[i];
            }
        }
        for(i=0;i<arr.length;i++){
            arr[i]=A[i];
        }
    }
}

