import java.lang.Object;

public class ProductEach {
    private int product(int nums){
        int res=1;
        while(nums!=0){
            res*=(nums%10);
            nums=nums/10;
        }
        return res;
    }public static void main(String[] args) {
        ProductEach obj=new ProductEach();
        System.out.println(obj.product(5244));
    }
}

