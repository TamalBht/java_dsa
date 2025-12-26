
import java.util.*;
import java.lang.*;
import java.io.*;

public class MajorityElement {
    public List<Integer>majorEle(int[] nums){
        List<Integer> res=new ArrayList<>();
        int target=nums.length /3;
        HashMap<Integer,Integer> hs= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i], hs.getOrDefault(nums[i],0)+1);

        }
        for(Integer key : hs.keySet()){
            if(hs.get(key)>target)res.add(key);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        MajorityElement obj=new MajorityElement();
        List<Integer> res=obj.majorEle(nums);
        System.out.println(res);
    }
}
