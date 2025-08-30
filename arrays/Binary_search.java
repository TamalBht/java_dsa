package arrays;

import java.util.Scanner;

public class Binary_search {
    int bs(int arr[],int low,int high,int target){
        if(low>high)return -1;
        int mid=(low+high)/2;
        if(arr[mid]==target) return mid;
        if(target<arr[mid]) return bs(arr,low,mid-1,target);
        else return bs(arr,mid+1,high,target);
        
    }
    int search(int nums[],int target){
        return bs(nums,0,nums.length-1,target);
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
        Binary_search bin=new Binary_search();
        System.out.print("Index:"+ bin.search(arr,target));
    }
}
