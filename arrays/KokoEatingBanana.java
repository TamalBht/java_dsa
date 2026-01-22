import java.util.*;
import java.lang.*;
import java.io.*;

//each index represents the pile of banana
//we need to find the minimum speed in which the monkey can eat all the bananas in a given time

public class KokoEatingBanana {
    public long calcHr(int[] piles,long speed){
        long totall=0;
        for(int p : piles){
            totall+=(p+speed-1)/speed;
        }
        return totall;
    }
    public int minEatSpeed_bs(int[] piles,int h){
        int maxPiles=Arrays.stream(piles).max().getAsInt();
        long start=1,end=maxPiles;
        long ans=maxPiles;
        while(start<=end){
            long mid=(start+end)/2;
            long res=calcHr(piles, mid);
            if(res>h) {
                //if the taken time is too high this means the speed is too slow as time inversely proportional to speed so we increase the speed
                start=mid+1;
            }
            else{
                //case: res<= mid in this case we decrease the speed to increase the time
                ans=mid;
                end=mid-1;
            }
        }
        return (int)ans;


    }
    public int minEatSpeed(int[] piles,int h){
        //finding the max element
        int maxPile=Arrays.stream(piles).max().getAsInt();
        
        
        //checking for all speed from 1-maxPile
        //if we get res is less than or equal to h we return i as it is the minimum speed to eat all the piles else we return the largest pile size as the speed
        for(int i=1;i<=maxPile;i++){
            int res=calcHr(piles, i);
            if(res<=h)return i;
        }
        return maxPile;
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int[] piles=new int[n];
        for(int i=0;i<n;i++){
            piles[i]=Integer.parseInt(args[i+1]);
        }
        int h=Integer.parseInt(args[n+1]);
        KokoEatingBanana obj=new KokoEatingBanana();
        int res=obj.minEatSpeed_bs(piles, h);
        System.out.print(res);
    }
}
