import java.lang.String;
import java.lang.Math;
public class MaxEle{
    public static void main(String[] args){
        int n=args.length;
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(args[i]);
        }
        int maxele=Integer.MIN_VALUE;
        int count=0;
        for(int i:arr){
            if(i>maxele)count++;
            maxele=Math.max(i,maxele);
        }
        System.out.println(count);
    }
}
