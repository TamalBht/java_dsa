import java.util.*;
import java.lang.*;
import java.io.*;
public class SubSumN {
    public int subarraySum(int[]nums,int k){
        int n=nums.length;
        int count=0;
        
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==k)count++;
            }
        }
        return count;
    }
    public int subArraySum_optimized(int[] nums,int k){
        int n=nums.length;
        //map to store the presum frequencies
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int sum=0,count=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            
            
                int diff=sum-k;
                //check if sum-target as appearedd erlier on not 
                //if it has add the numbe of frequencies it has been i.e count+=frequency
                if (map.containsKey(diff)) count+=map.get(diff);
            
            //update the map with each iteration
            map.put(sum, map.getOrDefault(sum, 0)+1);

        }
        return count;

    }
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=Integer.parseInt(args[i+1]);
        }
        int target=Integer.parseInt(args[nums.length+1]); 
        SubSumN obj=new SubSumN();
        int res=obj.subArraySum_optimized(nums, target);
        System.out.print(res);
    }
}
