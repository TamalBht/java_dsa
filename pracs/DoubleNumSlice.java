public class DoubleNumSlice {
    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        int r= Integer.parseInt(args[1]);
        int nSum=numSum(n);
        int res=numSum(r*nSum);
        System.out.println(res);
    }
    private static int numSum(int n){
        if(n==0)return 0;
        return n%10+numSum(n/10);
    }
}
