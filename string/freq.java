package string;
import java.util.*;
import java.io.*;
import java.lang.*;
public class freq {
    void freqSt(String s){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);
        char res='1';
        int freq=0;
        for(char c: map.keySet() ){
            if(map.get(c)>freq){
                freq=map.get(c);
                res=c;
            }
        }
        System.out.print(res+" "+freq);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
        sc.close();
        freq obj=new freq();
        obj.freqSt(s);
        
    }
}
