import java.util.*;
import java.lang.*;
import java.io.*;
//merge two sorted arrays and store it in  nums1
//m,n represents the number of mergable elements
public class MergeSortedArrays {
    public void merge(int[] nums1,int m,int[] nums2,int n){
        int numLen1=nums1.length;
        int numLen2=nums2.length;
        if(numLen1>numLen2){
            int j=0;
            for(int i=m;i<numLen1;i++){
                if( j<nums2.length){
                    nums1[i]=nums2[j];
                    j++;
                }
            }
            Arrays.sort(nums1);
        }
        //no case exists where numlen1<numlen 2 pny case exists numlen1==numlen2
        else{
            if(m>n){
                int j=0;
                for(int i=n;i<numLen2;i++){
                    if(nums1[j]!=0 && j<nums1.length){
                    nums2[i]=nums1[j];
                    j++;
                }
                //copying back to nums1 as the length is same
                }
                for(int i=0;i<numLen1;i++){
                    nums1[i]=nums2[i];
                }
            }
            else{
                int j=0;
                for(int i=0;i<numLen1;i++){
                    if(nums1[i]==0){
                        nums1[i]=nums2[j];
                        j++;
                }
            }

        }
        Arrays.sort(nums1);
        
    }
}
}
