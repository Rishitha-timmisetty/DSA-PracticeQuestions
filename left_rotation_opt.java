//showing runtime error when submitted in gfg
import java.util.Scanner;
class p{
    public void reverse(int a[],int low,int high){
      while(low<high){
        int t=a[low];
        a[low]=a[high];
        a[high]=t;
        low++;
        high--;
      }
    }
}
public class left_rotation_opt {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int d=sc.nextInt();
    int a[]=new int[100];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    p o=new p();
    o.reverse(a,0,d-1);
    o.reverse(a,d,n-1);
    o.reverse(a,0,n-1);
    for(int i=0;i<n;i++){
    System.out.print(a[i]+" ");
}
}
}
