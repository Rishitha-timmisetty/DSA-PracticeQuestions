import java.util.Scanner;
public class array_freq_sorted {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int c=1;
        int n=sc.nextInt();
        int a[]=new int[100];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
           if(a[i-1]==a[i]){
            c=c+1;
           }
           else{
            System.out.println(a[i-1]+" "+c);
            c=1;
            } 
            if(i==n-1){
                System.out.println(a[i]+" "+c);
            } 

}
    }
}