import java.util.Scanner;
class p{
    int isPrime(int n){
        if(n==1){ return 0;}
        if(n==2||n==3){return 1;}
        if(n%2==0 ||n%3==0){return 0;}
        for(int i=5;i<=Math.sqrt(n);i=i+6){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    void factors(int n){
        for(int i=2;i<=n;i++){
        if(isPrime(i)==1){
           int k=i;
           while(n%k==0){
            System.out.print(i+" ");
            k=k*i;
           }
        }
    }
}
}

public class prime_fact1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    p o=new p();
    o.factors(n);    
}
}