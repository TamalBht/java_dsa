package arrays;

import java.util.Scanner;

public class N_Root {
    long nrt(long rep,long target){
        long low=1,high=target,res=-1;
        while(low<=high){
            long mid=(low+high)/2;
            long mid_n=1;
            for(int i=0;i<rep;i++){
                mid_n*=mid;
            }
            if(mid_n==target) return mid;
            else if(mid_n>target)high=mid-1;
            else low=mid+1;
        }
        return res;
    }

     public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
      long  rep=sc.nextInt();
      long target=sc.nextInt();
      sc.close();
      N_Root obj=new N_Root();
      System.out.print(obj.nrt(rep,target));

    }
    
}
