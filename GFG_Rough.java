import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

public class GFG_Rough {
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        static int[] majorityElement(final List<int[]> list) {
            int k=list.size()/2;
            for(int i=0;i<list.size()-1;i++){
                int c=1;
                for(int j=i+1;j<list.size();j++){
                    if(list.get(i)==list.get(j)){
                        c++;
                        if(c>=k){
                          System.out.println(list.get(i));
                          return list.get(i);
                        }
                    }
                }
            }
            System.out.println(-1);
                 return list.get(0);
        }
    
    public static void main(String[] args) {
        int a[]={1,2,3,3,3,3,3,4};
        List<int[]> list = Arrays.asList(a);
      majorityElement(list);
    }
}
    
