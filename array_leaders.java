import java.util.Scanner;
public class array_leaders {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f;
        int a[]=new int[100];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            f=0;
            for(int j=i+1;j<n;j++){
            if(a[i]<=a[j]){
                f=1;
                break;
            }
            // else{
            //     if(j==n-1){
            //         System.out.println(a[i]);
            //     }
            // }
     }
     if (f==0){
        System.out.println(a[i]);
     }
    }
    // System.out.println(a[n-1]);
}
}
