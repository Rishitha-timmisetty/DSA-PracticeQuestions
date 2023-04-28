//O(r-l+1)-Time complexity
import java.util.Scanner;
public class PrefixSum {
    static int a[]={2,8,3,9,6,5,4};
    // public static void main(String[] args) {
    //     getSum(0,2);
    //     getSum(1,3);
    //     getSum(2,6);
    // }
    // static void getSum(int s,int e){
    //     int sum=0;
    //     for(int i=s;i<=e;i++){
    //         sum+=a[i];
    //     }
    //     System.out.print(sum+" ");
    // }
    //O(1)-Time complexity;O(N)-work;O(N)-Auxilary space
    static void preprocess(int a[],int p[]){
        int sum=0;
        /*p[0]=a[0]; */
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            p[i]=sum;
        /* p[i]=p[i-1]+a[i];*/
        }
    }
    static void getSum(int p[],int s,int e){
         if(s==0){System.out.println(p[e]); }
         else{
             System.out.println((p[e]-p[s-1]));
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int a[]={2,8,3,9,6,5,4};
        int p[]=new int[a.length];
        preprocess(a,p);
        getSum(p,s,e);
        
    }
}
