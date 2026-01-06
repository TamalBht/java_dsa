import java.util.*;
import java.io.*;
import java.lang.*;
//there will be an array of arrays the inner arrays set of two numbers 
//our job is to merge the arrays if it ids possible 
//exaample[[1,3],[2,6],[8,10]] output-> [[1,6],[8,10]] logic: sice 2 lies between 1 and 3 => we can mergew them
public class MergeSubIntervals {
    public int[][] mergee(int[][] intervals){
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int n=intervals.length;
         List<int[]>res=new ArrayList<>();

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            Arrays.sort(intervals[i]);
            map.put(intervals[i][0], i);
        }
        
         int indexIgnored=-1;
        for(int i=0;i<n;i++){
            if(i==indexIgnored)continue;
            if(i>0 && intervals[i][0]==intervals[i-1][0] && intervals[i][1]==intervals[i-1][1])continue;
            int start=intervals[i][0];
            int end=intervals[i][1];
           int[] temp=new int[2];
            for(int j=start+1;j<=end;j++){

                if(map.containsKey(j)){
                    
                    temp[0]=start;
                    temp[1]=intervals[map.get(j)][1];
                    indexIgnored=map.get(j);
                    res.add(temp);
                }
            }
            if(i!=indexIgnored && temp[0]==temp[1] && temp[0]==0)res.add(intervals[i]);


        }
        int k=res.size();
        int[][] finall=new int[k][2];
        for(int i=0;i<k;i++){
            finall[i]=res.get(i);
        }
        return finall;
    }
    public static void main(String[] args) {
        int size=Integer.parseInt(args[0]);
        int[][] intervals =new int[size][2];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<size;i++){
            intervals[i][0]= sc.nextInt();
            intervals[i][1]= sc.nextInt();
        }
        MergeSubIntervals obj = new MergeSubIntervals();
        int[][] res=obj.mergee(intervals);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i][0]);
            System.out.println(res[i][1]);
            
        }
    }
}
