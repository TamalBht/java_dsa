package arrays;

import java.util.Scanner;

public class LowerBounnd {
    int lb(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=x)return i;
        }


        return -1;
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
        LowerBounnd lb = new LowerBounnd();
        System.out.print(lb.lb(arr, x));
    }
}
