import java.util.*;
import java.lang.*;
import java.io.*;


public class AgressiveCows {
    // public int returnMin(int[] arr, int target,int cows){
        
    //     int left=0;
    //     int right=1;
    //     int count=1;
    //     int ans=Integer.MAX_VALUE;
    //     int n=arr.length;
    //     while(left<right && right<n){
    //         int diff=arr[right]-arr[left];
    //         if(diff>=target){
    //             count++;
    //             ans=Math.min(ans,diff);
    //             left++;
    //         }
            
            
    //         right++;

    //     }
        
    //     if(count<cows)return -1;
    //     return ans;
    // }

    public boolean canPlace(int[] arr,int target,int cows){
        int count=1;
        //assumin the position of first cow as the first index
        int prevv=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-prevv>=target){
                count++;
                //moving it to the next cow placed
                prevv=arr[i];
                if(count==cows)return true;
            }
            
        }
        return false;
    }
    public int maxiMiniDist(int[] arr,int cows){
        Arrays.sort(arr);
        int res=0;
        
        int n=arr.length;
        int maxx=arr[n-1]-arr[0];
        for(int i=1;i<=maxx;i++){
            if(canPlace(arr, i, cows)) res=i;
        }
        return res;

    }
    public static void main(String[] args) {
        int[] nums={0,3,4,7,10,9};
        int cows=4;
        AgressiveCows obj=new AgressiveCows();
        int res= obj.maxiMiniDist(nums,cows);
        System.out.println(res);
    }
}
