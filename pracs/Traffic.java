import java.util.Scanner;

public class Traffic {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int[] nums=new int[n];
    int oddCount=0;
    int evenCount=0;
    for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
        if(nums[i]%2==0)evenCount++;
        else oddCount++;
    }
    int d = sc.nextInt();
    int val=sc.nextInt();
    sc.close();
    int res=0;
    if(d%2==0)res=oddCount*val;
    else res=evenCount*val;
    System.out.println(res);
    }

}
