class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int cols=matrix[0].length;
        int j=matrix[0].length*matrix.length-1;

        while(i<=j){
            int mid=i+(j-i)/2;
            int row=mid/cols;
            int col=mid%cols;
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]<target) i=mid+1;
            else j=mid-1;
        
        }

        return false;
        
    }
}