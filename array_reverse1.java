import java.util.Scanner;
public class array_reverse1 {
    public static void main(String args[]){
        int n;
        int a[]=new int[100];
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=0,j=n-1;
        while(k<j){
            int t=a[k];
            a[k]=a[j];
            a[j]=t;
            k++;
            j--;
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        
    }
}
