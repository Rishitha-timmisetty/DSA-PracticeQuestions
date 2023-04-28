import java.util.Scanner;
public class array_max_diffp {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f;
        int a[]=new int[100];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int r=a[1]-a[0],min=a[0];
        for(int i=1;i<n;i++){
          min=Math.min(min,a[i]);
        }
        for(int i=1;i<n;i++){
            r=Math.max(r,a[i]-min);
          }
        System.out.println(min);
        System.out.println(r);
    }
}