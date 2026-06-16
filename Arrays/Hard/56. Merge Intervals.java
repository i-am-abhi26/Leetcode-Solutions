import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> a=new ArrayList<>();
        a.add(intervals[0]);
        for(int i=1;i<n;i++){
            if(a.get(a.size()-1)[1]>=intervals[i][0] && a.get(a.size()-1)[1]<=intervals[i][1]){
                a.get(a.size()-1)[1]=intervals[i][1];
            }
            else if(a.get(a.size()-1)[1]>=intervals[i][0] && a.get(a.size()-1)[1]>=intervals[i][1]){
                a.get(a.size()-1)[1]=a.get(a.size()-1)[1];
            }
            else{
                a.add(intervals[i]);
            }
        }
        return a.toArray(new int[a.size()][2]);
    }
}
