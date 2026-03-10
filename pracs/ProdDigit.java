imporrt java.util.Scanner;

public class ProdDigit{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int res=1;
        while(n>0){
            res*=n%10;
            n=n/10;
        }
        System.out.println(res);
    }
}