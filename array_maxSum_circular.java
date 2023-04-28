// public class array_maxSum_circular {
//     public static void main(String[] args) {
//         int a[]={2,-5,3,4},r=a[0];
//         for(int i=0;i<a.length;i++){
//             int sum=a[i],max=a[i];
//             for(int j=1;j<a.length;j++){
//             sum=sum+a[(i+j)%a.length];
//             max=Math.max(max,sum);
//         }
//        r=max(r,max);
//     }
//         System.out.println(r);
//     }
// }
// O(N)-
public class array_maxSum_circular {
    public static void main(String[] args) {
        int a[]={-8,-1,-5,-4,-12},r=a[0],max=0,sum=0,min_sum=0,k=0,min=0,total=0;
        for(int i=0;i<a.length;i++){
            total=total+a[i];
        }
        System.out.println(total);
        for(int i=0;i<a.length;i++){
            min_sum=min_sum+a[i];
            sum=sum+a[i];
            if(sum>max){
                max=sum;
            }
            if(min_sum>min){
                min_sum=min;
                }
            if(sum<0){
                sum=0;
            }
            r=Math.max(max,r);
            k=Math.min(min_sum,k);
    }
    if(r==0){
        int m=a[0];
    for(int i=1;i<a.length;i++){
        if(a[i]>m){
            m=a[i];
        }
        r=m;
    }
    k=r;
}
    int p=total-k;
    System.out.println("max in norm:"+r);
    System.out.println("min sum SubArraySum:"+k);
    System.out.println("max in circular:"+p);
    System.out.println("Answer:"+Math.max(k,p));

}
}