package arrays;
import java.util.*;
public class First_Last {
    int bs(int [] arr,int target,int low,int high){
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(arr[mid]==target)return mid;
        else if(arr[mid]<target)return bs(arr,target,mid+1,high);
        else return bs(arr,target,low,mid-1);
    }
    public int[] searchRange(int[] nums,int target){
        
        int[] ans={-1,-1};
        if(nums.length==0) return ans;
        int res=bs(nums,target,0,nums.length-1);
        if(res==-1){
            
            return ans;
        }
        int first=res;
        while(nums[first-1]==target && first >0){
            first--;
        }
        int last=res;
        while(last<nums.length-1 && nums[last+1]==target) last++;
        ans[0]=first;
        ans[1]=last;
        return ans;
    }
    public static void main(String[] args){
        int n,target;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Target: ");
        target=sc.nextInt();
        sc.close();
        First_Last obj =new First_Last();
        int[] res=obj.searchRange(arr,target);
        System.out.print(res[0]+" "+res[1]);
    }
}
