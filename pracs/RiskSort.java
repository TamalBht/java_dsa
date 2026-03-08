import java.util.Scanner;

public class RiskSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int c0=0,c1=0,c2=0;
        for(int num:arr){
            if(num==0)c0++;
            else if(num==1)c1++;
            else c2++;
        }
        int cap=0;
        for(int i=0;i<c0;i++){
            arr[cap++]=0;
        }
        for(int i=0;i<c1;i++)arr[cap++]=1;
        for(int i=0;i<c2;i++)arr[cap++]=2;
        for(int i=0;i<n;i++)System.out.print(arr[i]+" ");

    }
}
