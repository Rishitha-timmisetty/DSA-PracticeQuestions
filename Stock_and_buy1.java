//need to cross check
import java.util.Scanner;
class c{
    public int m(int a[],int s,int e){
        if(e<=s){
            return 0;
        }
        int p=0;
         for(int i=s;i<e;i++){
            for(int j=i+1;j<=e;j++){
                if(a[j]>a[i]){
                   int current_p=(a[j]-a[i])+m(a,s,i-1)+m(a,j+1,e);
                   p=Math.max(current_p,p);
                }
            }
        }
        System.out.println(p);
        return p;
    }
}
public class Stock_and_buy1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        c o=new c();
        o.m(a,0,n-1);
    }
}