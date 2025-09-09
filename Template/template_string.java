package Template;

import java.util.Scanner;

import string.remove_parenthesis;

public class template_string {
    public static void main(String[] chars){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        remove_parenthesis obj=new remove_parenthesis();
        String res=obj.remOutPar(str);
        System.out.print(res);
        
    }
}
