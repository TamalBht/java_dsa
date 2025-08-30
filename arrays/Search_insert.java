package arrays;

import java.util.Scanner;

public class Search_insert {
    
    int ub(int arr[],int x,int low,int high){
        if(low>high) return low;
        int mid=(low+high)/2;
        if(arr[mid]==x)return mid;
        
        
        else if(arr[mid]<x) return ub(arr,x,mid+1,high);
        else return  ub(arr,x,low,mid-1);   
        
        
    }
    int search(int nums[],int target){
        return ub(nums,target,0,nums.length-1);


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
        Search_insert src=new Search_insert();
        System.out.print("Index:"+ src.search(arr,target));
    }
}
