import java.util.*;
import java.lang.*;
import java.io.*;
 // return the longest Sub arr whose sum ==0
public class LongestSubSum0 {
    public int longest_brute(int[] nums){
        //first to last sum till 0 is achieved if not achieved then dont push it 
        List <Integer> res=new ArrayList<>();

        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=nums[i];
            int count=1;
            for(int j=i+1;j<n;j++){
                sum+=nums[j];
                count++;
                if(sum==0) res.add(count);
            }
        }
        if (res.isEmpty()) return 0;
        Collections.sort(res);
        return res.getLast();
    }
    public int longest_better(int[] nums){
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int n=nums.length;
        int sum=0;
        int maxL=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum==0)maxL=Math.max(maxL, i+1);
            else{
                if(mpp.containsKey(sum))maxL=Math.max(maxL,i-mpp.get(sum));
                else{
                    mpp.put(sum, i);
                }
            }
        }
        return maxL;
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=Integer.parseInt(args[i+1]);
        } 
        LongestSubSum0 obj= new LongestSubSum0();
        int res=obj.longest_better(nums);
        System.out.print(res);
    }
}
