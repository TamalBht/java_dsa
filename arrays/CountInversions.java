import java.util.*;
import java.lang.*;
import java.io.*;

public class CountInversions {
    public int merge(int []arr,int low,int mid,int high){
        List<Integer>temp=new ArrayList<>();
        int i=low;
        int count=0;
        int j=mid+1;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j])temp.add(arr[i++]);
            else{
                temp.add(arr[j++]);
                count+=(mid-i+1);
            }

        }
        //copying the rest of the elements
        while(i<=mid)temp.add(arr[i++]);
        while(j<=high)temp.add(arr[j++]);
        //copying it to the original array
        for(int k=0;k<temp.size();k++){
            arr[k+low]=temp.get(k);
        }
        return count;
    }
    public int ms(int[] arr,int low,int high){
        int count=0;
        if(low>=high)return count;
        int mid=(low+high)/2;
        count+=ms(arr,low,mid);
        count+=ms(arr,mid+1,high);
        count+=merge(arr,low,mid,high);

        return count;

    }
    public int cntInv_opt(int[] nums){
        return ms(nums, 0, nums.length-1);
    }
    public int countInv(int[] nums){
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int j=n-1;
            while(i<j){
                if(nums[i]>nums[j])count++;
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
        CountInversions obj= new CountInversions();
        int res=obj.cntInv_opt(nums);
        System.out.print(res);
    }
}
