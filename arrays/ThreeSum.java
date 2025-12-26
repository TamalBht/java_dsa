import java.util.*;
import java.lang.*;
import java.io.*;
public class ThreeSum {
    public List<List<Integer>> showSum(int [] nums){
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<n-2;i++){
            List<Integer> subArr=new ArrayList<>();
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0 && !(nums[i]==0 && nums[j]==0 && nums[k]==0)){
                        subArr.add(nums[i]);
                        subArr.add(nums[j]);
                        subArr.add(nums[k]);
                    }
                    
                }
                if(subArr.size()==3)break;
                
            }
            if(subArr.size()>0)res.add(subArr);
        }
        
        return res;
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=Integer.parseInt(args[i+1]);

        }
        ThreeSum obj=new ThreeSum();
        List<List<Integer>> res =obj.showSum(nums);
        System.out.println(res);
    }
}
