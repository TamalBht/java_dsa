package string;

import java.util.Scanner;

public class Longest_prefix {
    String longestPre(String[] strs){
        if(strs.length==0)return "";
        if(strs[0].isEmpty())return "";
        int ptr=0;
        StringBuilder sb=new StringBuilder();
        while(ptr<strs[0].length()){
            int count =0;
            
            char match=strs[0].charAt(ptr);
            for(int i=0;i<strs.length;i++){
                
                if(ptr<=strs[i].length()-1 && strs[i].charAt(ptr)==match){
                    count++;
                    
                    
                }
                else break;
            }
            if(count==strs.length){
                sb.append(strs[0].charAt(ptr));
                ptr++;
            }
            else break;
        }
        return sb.toString();

    }
    public static void main(String[] chars){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] s= new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        Longest_prefix obj=new Longest_prefix();
        String res=obj.longestPre(s);
        System.out.print(res);
        
    }
}
