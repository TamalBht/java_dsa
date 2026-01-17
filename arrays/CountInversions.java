import java.util.*;
import java.lang.*;
import java.io.*;

public class CountInversions {
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
        int res=obj.countInv(nums);
        System.out.print(res);
    }
}
