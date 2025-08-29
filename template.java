public class template{
    int count =0;
    public void recur(int n){
        if(count==n) return;
        else{
            count++;
            System.out.println("Hello world");
            recur(n);
        }
    }
    public static void main(String[]args){
        template t= new template();
        t.recur(5);
    }
}