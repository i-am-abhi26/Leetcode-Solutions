class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> temp=new ArrayList<>();
            int k=0;
            for(int j=1;j<=i;j++){
                if(j==1){
                    temp.add(1);
                }
                else if(j==i){
                    temp.add(1);
                }
                else{
                    int a=list.get(i-2).get(k);
                    int b=list.get(i-2).get(k+1);
                    temp.add(a+b);
                    k++;
                }
            }
            list.add(temp);
        }
        return list;
    }
}
