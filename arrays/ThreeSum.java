//sum of 3 distinct elements =0
import java.util.*;
import java.lang.*;
import java.io.*;
public class ThreeSum {
    public List<List<Integer>> showSum(int [] nums){
                Set<List<Integer>> res=new HashSet<>();

        
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0 ){
                        List<Integer> subArr=new ArrayList<>();
                        subArr.add(nums[i]);
                        subArr.add(nums[j]);
                        subArr.add(nums[k]);

                        res.add(subArr);
                    }
                    
                }
                
                
            }
            
        }
        
        return new ArrayList<>(res);
    }
    public List<List<Integer>> showSumOptimal(int[] nums){
        Set<List<Integer>> res=new HashSet<>();
        
        int n=nums.length;
        for(int i=0;i<n;i++){
            Set<Integer>temp=new HashSet<>();
            
            for(int j=i+1;j<n;j++){
                int third=-(nums[i]+nums[j]);
                if(temp.contains(third)){
                    List<Integer> triplet= new ArrayList(Arrays.asList(nums[i],nums[j],third));
                    Collections.sort(triplet);
                    res.add(triplet);
                }
                temp.add(nums[j]);
            }
        }
        return new ArrayList<>(res);
    }
    public List<List<Integer>>showSum2(int[] nums){
        Set<List<Integer>> res=new HashSet<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            int left = i+1;
            int right=n-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    List<Integer> temp=new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right]));
                    res.add(temp);
                    left++;
                    right--;
                }
                else if (sum <0)left++;
                else right--;
            }
        }
        return new ArrayList<>(res);
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=Integer.parseInt(args[i+1]);

        }
        ThreeSum obj=new ThreeSum();
        List<List<Integer>> res =obj.showSum2(nums);
        System.out.println(res);
    }
}
