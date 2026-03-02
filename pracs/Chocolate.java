import java.util.ArrayList;
import java.util.Scanner;

public class Chocolate {
    private void belt(int[]arr){
        int n=arr.length;
        ArrayList<Integer> temp=new ArrayList<>();
        
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)count++;
            else temp.add(arr[i]);
        }
        for(int i=0;i<count;i++){
            temp.add(0);
        }
        //copying it back to the originl array
        for(int i=0;i<n;i++){
            arr[i]=temp.get(i);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Chocolate obj=new Chocolate();
        obj.belt(arr);
        for(int a:arr){
            System.out.print(a +" ");
        }

    }
}
