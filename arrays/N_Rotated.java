package arrays;
import java.util.Scanner;


public class N_Rotated {
    int n_rotate(int[] nums){
        int k=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]<nums[i-1])k=i;
        }
        return k;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       
        sc.close();
        N_Rotated obj=new N_Rotated();
        System.out.print(obj.n_rotate(arr));
    }
}
