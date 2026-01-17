import java.util.*;
import java.lang.*;
import java.io.*;

public class FindMissingAndRepeating {
    public int[]findd(int[]nums){
        Arrays.sort(nums);
        int sum=0;
        int repeat=-999;
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])repeat=nums[i];
        }
        for(int inner:nums){
            hs.add(inner);
        }
        int n=nums[nums.length-1];
        for(int hsIn:hs){
            sum+=hsIn;
        }
        int missing=((n*(n+1))/2)-sum;
        int[] temp={repeat,missing};
        return temp;


    }
    public int[] find_better(int[] nums){
        HashSet<Integer>hs=new HashSet<>();
        for(int a:nums){
            hs.add()
        }
    } 
    public static void main(String[] args) {
        int n= Integer.parseInt(args[0]);
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=Integer.parseInt(args[i+1]);
        }
        FindMissingAndRepeating obj=new FindMissingAndRepeating();
        int[] res=obj.findd(nums);
        System.out.println(res[0]);
        System.out.println(res[1]);
        
    }
}
