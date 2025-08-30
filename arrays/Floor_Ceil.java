package arrays;

import java.util.Scanner;

public class Floor_Ceil {
    int ub(int arr[],int low,int high,int target){
        
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(arr[mid]==target)return arr[mid];
        else if(arr[mid]<target){
            int right = ub(arr,mid+1,high,target);
            return (right!=-1)?right:arr[mid];
        }
        else{
            return ub(arr,low,mid-1,target);
        }
    }
    int higher(int arr[],int low,int high,int target){
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(arr[mid]>=target){
            //scheck in the left if there is something greater
            int left=higher(arr,low,mid-1,target);
            return (left !=-1)?left:arr[mid];
        }//if it is less
        else {
            return higher(arr,mid+1,high,target);
        }
    }
    int[] f_c(int arr[],int x){
        int[] ans=new int[2];
        ans[0]=ub(arr,0,arr.length-1,x);
        ans[1]=higher(arr,0,arr.length-1,x);
        return ans;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("Enter Targer: ");
        int t= sc.nextInt();
        sc.close();
        Floor_Ceil obj=new Floor_Ceil();
        int[] ans=obj.f_c(arr,t);
        System.out.print(ans[0]+" "+ans[1]);
    }
}
