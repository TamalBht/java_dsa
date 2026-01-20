import java.util.*;
import java.lang.*;
import java.io.*;
//count the number of pairs such that i<j and arr[i]>2*arr[j]

public class CountReversePairs {
    //the main difference with the inversion count is here we count the number of pairs BEFORE MERGE
    public void mergee(int[] nums,int low,int mid,int high){
        int left=low;
        List<Integer> temp=new ArrayList<>();
        int right=mid+1;
        
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right])temp.add(nums[left++]);
            else{
                
                temp.add(nums[right++]);
            }
        }
        //rest of the elements
        while(left<=mid)temp.add(nums[left++]);
        while(right<=high)temp.add(nums[right++]);
        for(int i=0;i<temp.size();i++){
            nums[i+low]=temp.get(i);
        }
         
    }
    //where the counting occurs
    public int countPiars(int[] nums,int low,int mid,int high){
        int count=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && nums[i]>2*nums[right])right++;
                 count+=right-(mid+1);
                

            
        }
        return count;
    }
    public int ms(int nums[],int low,int high){
        int count=0;
        if(low>=high)return count;
        int mid=(low+high)/2;
        count+=ms( nums,low, mid);
        count+=ms( nums,mid+1,high);
        count+=countPiars(nums, low, mid, high);
        //then we perform merge step
        mergee(nums, low, mid, high);

        return count;
        
    }
    public int revPair_optimal(int[]nums){
        return ms(nums, 0, nums.length-1);
    }

//bruteforce methods
    public int reversePairs(int[] nums){
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int j=n-1;
            while(i<j){
                 long a=(long)nums[i];
                 long b=(long)nums[j];
                if(a>2*b)count++;
                j--;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=Integer.parseInt(args[i+1]);
        }
        CountReversePairs obj=new CountReversePairs();
        int res=obj.revPair_optimal(nums);
        System.out.print(res);
    }
}
