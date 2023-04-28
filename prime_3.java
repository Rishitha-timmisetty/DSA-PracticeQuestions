//approx 3 times faster than the efficiant method:prime_2
import java.util.Scanner;
public class prime_3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n==1){
        System.out.println("np");
        return;
    }
    if(n==2||n==3){
        System.out.println("p");
        return;
    }
    if(n%2==0||n%3==0){
       System.out.println("np");
       return;
    }
    for(int i=5;i*i<=n;i=i+6){
        if(n%i==0|| n%(i+2)==0){
            System.out.println("np");
            return;
        }
    }
            System.out.println("p");
            return;
     
}
}
