package string;

import java.util.Scanner;

public class Reverse_sentence {
    String reverseWords(String s){
        String[] temp=(s.trim()).split("\\s+");
        int high=temp.length-1;
        int low=0;
        
        while(low<=high){
            String temporary=temp[low];
            temp[low]=temp[high];
            temp[high]=temporary;
            low++;
            high--;
        }
        for(int i=0;i<temp.length;i++){
            if(temp[i].matches(" "))temp[i]="";
        }
        //removing extra spaces

        
        return String.join(" ",temp);

    }

    public static void main(String[] chars){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        Reverse_sentence obj=new Reverse_sentence();
        String res=obj.reverseWords(str);
        System.out.print(res);
        
    }
}
