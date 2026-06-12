class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> row=new HashSet<>();
        HashSet<Integer> col=new HashSet<>();
        int m=matrix.length,n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i:row){
            for(int j=0;j<n;j++){
                matrix[i][j]=0;
            }
        }
        for(int j:col){
            for(int i=0;i<m;i++){
                matrix[i][j]=0;
            }
        }
    }
}
