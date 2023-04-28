//efficient
import java.util.Scanner;
public class stock_and_buy2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int p=0;
        for(int i=1;i<n;i++){
            if(a[i-1]<a[i]){
                p=p+(a[i]-a[i-1]);
            }
        }
        System.out.println(p);
    }
}
