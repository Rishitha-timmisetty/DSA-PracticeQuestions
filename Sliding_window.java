//Solution for SubArray of the given Sum and given window size
public class Sliding_window{
    public static void main(String[] args) {
        int a[]={1,8,30,-5,20,7},k=4,curr=0;
        for(int i=0;i<k;i++){
            curr+=a[i];
        }
        int max=curr;
        for(int i=k;i<a.length;i++){
          curr+=a[i]-a[i-k];
        max=Math.max(max,curr);
    }
    System.out.println(max);
}
}