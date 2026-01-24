import java.util.*;
import java.lang.*;
import java.io.*;

public class FindKthIndex {
    public boolean bs(int[] arr,int target){
        int low=0;
        int n=arr.length;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target)return true;
            else if(arr[mid]<target)low=mid+1;
            else high=mid-1;
        }
        return false;
    }
    public int findKthPositive(int[] arr,int k){
        int count =0;
        int ans=-1;
        int n=arr.length;
        
        for(int i=1;i<2*arr[n-1];i++){
            if(!bs(arr, i))count++;
            if(count==k) return i;
        }
        return -1;
    }
    public int findKthPositive_opt(int[] arr,int k){
        int n=arr.length;
        int summ=Arrays.stream(arr).sum();
        int maxx=2*summ+1;
        
        int[] temp=new int[maxx];
        for(int i=0;i<n;i++){
            temp[arr[i]]=1;
        }
        int count =0;
        for(int i=1;i<temp.length;i++){
            if(temp[i]==0)count++;
            if(count==k)return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={2,3,4,7,11};
        int k=5;
        FindKthIndex obj=new FindKthIndex();
        int res=obj.findKthPositive_opt(arr, k);
        System.out.println(res);
    }
}
