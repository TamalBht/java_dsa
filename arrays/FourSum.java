//sum of 4 distinct elements =target
import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.io.*;

public class FourSum {
    public List<List<Integer>> four_brute(int[] nums ,int target){
        Set<List<Integer>> res =new HashSet<>();
        
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                for(int k=j+1;k<n-1;k++){
                    for(int l=k+1;l<n;l++){
                        if(nums[i]+nums[j]+nums[k]+nums[l]==target){
                            List<Integer> temp= Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            Collections.sort(temp);
                            res.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
    public int binary_search(int[] nums,int low,int high,int target){
        if (low > high) return -1;
        int mid=(low+high)/2;
        if(nums[mid]==target) return mid;
        if(nums[mid]>target)return binary_search(nums, low, mid-1, target);
        if(nums[mid]<target)return binary_search(nums, mid+1, high, target);
        return -1;
    }
    public List<List<Integer>>four_better(int[] nums,int target){
        //approach like 3 sum first and then find the 4th element (sum-sum of 3) using binary search
        Set<List<Integer>> res =new HashSet<>();
        Arrays.sort(nums);
        
        int n=nums.length;
        for(int i=0;i<n;i++){
            int minn=99999;
            if(i>0 && nums[i]==nums[i-1])continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                for (int k = j + 1; k < n - 1; k++) {
                    if (k > j + 1 && nums[k] == nums[k - 1]) continue;
                    int sum=nums[i]+nums[j]+nums[k];
                    int reqd=target-sum;
                    int index=binary_search(nums, k+1, n-1, reqd);
                    if(index>-1){
                        res.add(
                            Arrays.asList(nums[i], nums[j], nums[k], nums[index])
                        );
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
    public List<List<Integer>>four_optimal(int[] nums,int target){
        int n=nums.length;
        Set<List<Integer>> res=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i-1]==nums[i])continue;
            for(int j=i+1;j<n;j++){
                if(j>0 && nums[j-1]==nums[j]) continue;
                int left=j+1;
                int right=n-1;
                while(left<right){
                    int sum=nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[left],nums[right]);
                        res.add(temp);
                        left++;right--;
                    }
                    if(sum<target)left++;
                    else right--;
                }
            }
        }
        return new ArrayList<>(res);
    }
    public static void main(String[] args) {
        int n= Integer.parseInt(args[0]);
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=Integer.parseInt(args[i+1]);
        }
        int target = Integer.parseInt(args[n+1]);
        FourSum obj=new FourSum();
        List<List<Integer>>res=obj.four_optimal(nums, target);
        System.out.print(res);
    }
}
