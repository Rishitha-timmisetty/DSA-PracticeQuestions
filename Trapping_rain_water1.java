import java.util.Scanner;
public class Trapping_rain_water1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int r=0;
        for(int i=1;i<n;i++){
          int lmax=a[i];
          for (int j=0;j<n-1;j++){
            lmax=Math.max(lmax,a[j]);
          }
          int rmax=a[i];
          for(int j=i+1;j<n;j++){
            rmax=Math.max(rmax,a[j]);
          }
         r= r+(Math.min(lmax,rmax)-a[i]);
        }
        System.out.println(r);
    }
}
