package string;
import java.util.*;
import java.io.*;
import java.lang.*;

public class frequencyCounting {
    void freqSt(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
    void freqInt(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of arr:");
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        String s=sc.next();
        sc.close();
        frequencyCounting obj=new frequencyCounting();
        obj.freqInt(arr);
        obj.freqSt(s);
        
    }
}
