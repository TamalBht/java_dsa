package arrays;

import java.util.*;
import java.io.*;

public class UpperBound {
    int ub(int arr[],int x){
        int maxx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x)
            maxx=Math.max(i,maxx);
        }


        return maxx;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target: ");
        int x=sc.nextInt();
        sc.close();
        UpperBound ub = new UpperBound();
        System.out.print(ub.ub(arr, x));
    }
}
