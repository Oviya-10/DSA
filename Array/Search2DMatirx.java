class Solution {
    public int bs(int a[] ,int n , int target){
        int i = 0;
        int j = n;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(a[mid] == target) 
               return mid;
            else if(a[mid] < target){
                i = mid +1;
            }
            else{
                j = mid -1;
            }
        }
        return -1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length - 1;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]<= target && target <= matrix[i][n]){
                int x = bs(matrix[i] , n , target);
                if(x!=-1){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }
}
