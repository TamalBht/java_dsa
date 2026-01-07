import java.util.*;
import java.io.*;
import java.lang.*;
//there will be an array of arrays the inner arrays set of two numbers 
//our job is to merge the arrays if it ids possible 
//exaample[[1,3],[2,6],[8,10]] output-> [[1,6],[8,10]] logic: sice 2 lies between 1 and 3 => we can mergew them
public class MergeSubIntervals {
    public int[][] mergee(int[][] intervals){
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);//sort based on the first number
        int i=0;
        List<int[]>res=new ArrayList<>();
        int n=intervals.length;
        while(i<n){
            int start=intervals[i][0];
            int end=intervals[i][1];
            int j=i+1;
            while(j<n && intervals[j][0]<=end){
                end=Math.max(end,intervals[j][1]);
                j++;
            }
            i=j;
            int temp[] = {start,end};
            res.add(temp);
        }
        int[][] finall = new int[res.size()][2];
         i=0;
        for(int[]it:res){
            finall[i]=it;
            i++;
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
