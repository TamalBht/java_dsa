public class Fact {
    public static void main(String[] args){
        int n= Integer.parseInt(args[0]);
        n--;
        int res=1;
        while(n>0){
            res*=n;
            n--;
        }
        System.out.println(2*res);
    }
}
