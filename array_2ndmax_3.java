//single traversal
import java.util.Scanner;
class p{
    int maxi3(int a[],int n){
        int m=-1,r=-1;
        for(int i=0;i<n;i++){
           if(a[i]>m && a[i]>r){
            r=m;
            m=a[i];
           }
           if(a[i]<m && r<a[i]){
            r=a[i];
           }
        }
        System.out.println(m+" "+ r);
        return r; 
    }
}
public class array_2ndmax_3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[100];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    p o=new p();
    o.maxi3(a,n);
}
}
