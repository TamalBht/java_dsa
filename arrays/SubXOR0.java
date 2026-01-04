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
        //here we will use the presum concept and stor it in hashmap
        //check if a given sum exists in hashmap or not if it already exists then the middle one is zer and hence the overall summ is equal to the given target 
        //lets say the sum is 6 and we see that 6 already exists at a given index if 6 appears again thatt means the xor of previous must be equal to 0 to give the xor sum as 6 

        HashMap<Integer,Integer> mpp=new HashMap<>();
        int n=nums.length;
        int xorVal=0;
        int count=0;
        for(int i=0;i<n;i++){
            xorVal^=nums[i];
            if(xorVal==target) count++;
            else{
                if(mpp.containsKey(xorVal)) count++;
                else {
                    mpp.put(xorVal,i);
                }
            }
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
