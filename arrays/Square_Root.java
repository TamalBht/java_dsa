package arrays;
import java.util.*;
public class Square_Root {
    int sqrt_brute(long  n){
        
        int bound=1;
        while((bound*bound)<n){
            
            bound++;
        }
        return bound;
    }
    long sqrt(long low,long high,long target){
        long res=0;
        while(low<=high){
            long mid=(low+high)/2;
            long mid_sq=mid*mid;
            if(mid_sq==target){
                res=mid;
                break;
            }
            else if(mid_sq>target){
                res=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }

        }
        return res;
    }
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
      long  n=sc.nextInt();
      sc.close();
      Square_Root obj=new Square_Root();
      System.out.print(obj.sqrt(1,n,n));

    }
}
