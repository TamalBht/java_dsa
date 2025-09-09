package string;
import java.util.*;
public class remove_parenthesis {
    public StringBuilder str=new StringBuilder();
    
    String remOutPar(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                if(count>1)str.append(s.charAt(i));
            }
            else{
                count--;
                if(count>0)str.append(s.charAt(i));
            }
        }
        return str.toString();
    }

    public static void main(String[] chars){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        remove_parenthesis obj=new remove_parenthesis();
        String res=obj.remOutPar(str);
        System.out.print(res);
        
    }
}
