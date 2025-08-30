package arrays;
import java.util.*;
import java.io.*;

public class Mergesort {
    void merge(int arr[],int low,int mid,int high){
        
        int[] temp=new int[high-low+1];
        int i=low;
        
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;k++;
            }
            else{
                temp[k]=arr[j];
                j++;k++;
            }
            
        
        }
        //copying the rest of the elements
            while(i<=mid){
                temp[k]=arr[i];
                i++;k++;
            }
            while(j<=high){
                temp[k]=arr[j];
                j++;k++;
            }
        //copying back to original arr
        for(int c=0;c<temp.length;c++){
            arr[low+c]=temp[c];
        }
    }
    void ms(int arr[],int low,int high){
        
        if(low<high){
            int mid=(low+high)/2;
            ms(arr,low,mid);
            ms(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        Mergesort mergesort= new Mergesort();
        mergesort.ms(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
