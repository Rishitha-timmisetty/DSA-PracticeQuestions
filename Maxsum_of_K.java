public class Maxsum_of_K {
    public static void main(String[] args) {
        int a[]={1,8,30,-5,20,70},k=3,max=0;
        for(int i=0;i<a.length-k+1;i++){
            int sum=0;
           for(int l=i;l<i+k;l++){
            sum+=a[l];
           }
           max=Math.max(sum,max);
        }
        System.out.println(max);
    }
}
/* for(int i=0;i+k-1<n;i++){
    int sum=0;
    for(int j=0;j<k;j++){
        sum+=a[i+j];
    }
    max=Math.max(sum,max);
}
System.out.println(max);
}
*/