package arrays;

import java.util.Scanner;

public class Search_Rotated {
    int bs(int [] arr,int target,int low,int high){
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(arr[mid]==target)return mid;
        else if(arr[mid]<target)return bs(arr,target,mid+1,high);
        else return bs(arr,target,low,mid-1);
    }
    public int search(int[] nums,int target){
        //here we need to find a dip
        //it is rotated in such a way that starting  from a certain point
        //basically there will be two halves one with greater and on eith lesser and in that we can implement binaray search to return the index
        int dip =-1;
        for(int i=nums.length-1;i>0;i--){
            if (nums[i]<nums[i-1]){
                dip=i;
                break;
            }
        }
        if(dip>-1){
            if(nums[dip]==target) return dip;
            //from dip to then right most end
           if( nums[nums.length-1]>target)return bs(nums,target,dip,nums.length-1);
           //from lieft till dip -1
            else if(nums[0]<target && nums[dip-1]>target) return bs(nums,target,0,dip-1);
        } 
        //if dip==-1 => array is sorted
        return bs(nums,target,0,nums.length-1);
    }

     public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target=sc.nextInt();
        sc.close();
        Search_Rotated bin=new Search_Rotated();
        System.out.print("Index:"+ bin.search(arr,target));
    }
}
