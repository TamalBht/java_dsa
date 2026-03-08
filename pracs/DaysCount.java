import java.util.HashMap;
import java.util.Scanner;

public class DaysCount {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> hs=new HashMap<>();
        hs.put("mon",6);
        hs.put("tue",5);
        hs.put("wed",4);
        hs.put("thurs",3);
        hs.put("fri",2);
        hs.put("sat",1);
        hs.put("sun",7);
        String s = sc.next();
        int num=sc.nextInt();
        int count=0;
        String temp= s.toLowerCase();
            int k=hs.get(temp);
            num=num-k;
            if(num>0){
                //first sunday
                count++;
                while(num>0){
                    num=num-7;
                    count++;
                }
            }
        System.out.println(count);

        
    }
    
}
