import java.util.*;
import java.io.*;
import java.lang.*;
public class SubXOR0 {
    //count the numbere of sub arrays with a given XOR value 
    public int numSubs(int[]nums,int target){
        int n=nums.length;
        int count=0;
        
        for(int i=0;i<n;i++){
            int summ=0;
            for(int j=i;j<n;j++){
                summ ^=nums[j];
                if(summ==target) count++;

            }
            

        }
        return count;
    }
    public int numSubs_optimal(int[]nums,int target){
       //prefix sum method
       //refer to SubSumN for more explanation

        
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int xorVal=0,count=0;
        for(int i=0;i<n;i++){
            xorVal^=nums[i];
            int rem=xorVal^target;
            if(map.containsKey(rem))count+=map.get(rem);
            map.put(xorVal,map.getOrDefault(xorVal,0 )+1);
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
        SubXOR0 obj=new SubXOR0();
        int res=obj.numSubs_optimal(nums, target);
        System.out.print(res);
    }
}
