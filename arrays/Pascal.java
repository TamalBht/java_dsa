import java.util.*;
import java.lang.*;
import java.io.*;
public class Pascal {
    public List<List<Integer>> calcPascal(int numRows){
        List<List<Integer>> res=new ArrayList<>();
        int first=1;
        for(int i=0;i<numRows;i++){
            List<Integer> rows=new ArrayList<>();
            if(i==0)rows.add(first);
            else{
            
            List<Integer> prev=res.get(i-1);
            rows.add(1);
            for(int k=0;k<prev.size()-1;k++){
                        int sum=0;
                        sum=prev.get(k)+prev.get(k+1);
                        System.out.println("Adding: "+sum);
                        rows.add(sum);
                    }
            rows.add(1);
                }

            res.add(rows);
        }
        return res;
        
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        Pascal obj=new Pascal();
        List<List<Integer>> res=obj.calcPascal(n);
        System.out.print(res);
    }
}
