public class MaxBox {
    public static void main(String[] args){
        String str=args[0];
        int l=Integer.parseInt(args[1]);
        int res=Integer.MIN_VALUE;
        int aCount=0;
        int count=0;
        for(int i=0;i<str.length();i++){
            count++;
            if(str.charAt(i)=='a')aCount++;
            if(count==l){
                count=0;
                res=Math.max(res,aCount);
                aCount=0;
            }
        }
        System.out.println(res);
    }
}
