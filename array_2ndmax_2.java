//gfg naive/brute force approach
import java.util.Scanner;
class p{
    int maxi2(int a[],int n){
        int max=0,res=-1;
        for(int i=1;i<n;i++){
            if(a[i]>a[max]){
                max=i;
            }
        }
        System.out.println(max);
        for(int i=0;i<n;i++){
            if(a[i]!=a[max]){
                if(res==-1){
                res=i;
                }
                else if(a[i]>a[res]){
                    res=i;
                }
            }
        }
        System.out.println(res);
        return res;
    }
}
public class array_2ndmax_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[100];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    p o=new p();
    o.maxi2(a,n);
}
}
