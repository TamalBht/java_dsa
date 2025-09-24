package string;

import java.util.*;

public class Sort_freq {
    public String frequencySort(String s) {
        StringBuilder sb=new StringBuilder();
         TreeMap <Character,Integer>hs=new TreeMap<>();
    for(int i=0;i<s.length();i++){
        
            hs.merge(s.charAt(i), 1, Integer::sum);
        
    }
    int sizeee=hs.size();
    for(int i=0;i<sizeee;i++){
        
        int count=0;
            char c=s.charAt(0);
        for(Character key:hs.keySet()){
            
            if(hs.get(key)>count){
                count=hs.get(key);
                c=key;
            }
        }
        
        for(int j=0;j<count;j++){
            sb.append(c);
        }
        hs.remove(c);
    }
    return sb.toString();
    }

     public static void main(String[] chars){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        sc.close();
        Sort_freq obj=new Sort_freq();
        String res=obj.frequencySort(str);
        System.out.print(res);
        
    }
   
}
