class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int rs=0,re=matrix.length-1,cs=0,ce=matrix[0].length-1;
        while(cs<=ce && rs<=re){
            for(int i=cs;i<=ce;i++){
                list.add(matrix[rs][i]);
            }
            rs++;
            if(rs>re){
                break;
            }
            for(int i=rs;i<=re;i++){
                list.add(matrix[i][ce]);
            }
            ce--;
            if(cs>ce){
                break;
            }
            for(int i=ce;i>=cs;i--){
                list.add(matrix[re][i]);
            }
            re--;
            if(rs>re){
                break;
            }
            for(int i=re;i>=rs;i--){
                list.add(matrix[i][cs]);
            }
            cs++;
        }
        return list;
    }
}
