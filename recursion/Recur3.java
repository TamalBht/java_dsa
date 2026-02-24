   import java.lang.Object;

public class Recur3 {
    //last to front

    private int nSum(int n){
        if(n==0)return 0;
        else return n+nSum(n-1);
    }
    //front to last
    private void nSum_para(int i,int sum){
        if(i==0){System.out.print(sum+"\n");
        return;}
        nSum_para(i-1, sum+i);

    }
    private int fact(int n){
        if(n==0 || n==1)return 1;
        else return n * fact(n-1);
    }
    private void fact_para(int i,int n ){
        if(i==0){
            System.out.println(n);
        }
        else fact_para(i-1, n*i);
    }
    public static void main(String[] args) {
        int n=3;
        Recur3 obj=new Recur3();
        System.out.print(obj.nSum(n));
        obj.nSum_para(n,0);
        System.out.print(obj.fact(n));
        obj.fact_para(n, 1);


    }
}
