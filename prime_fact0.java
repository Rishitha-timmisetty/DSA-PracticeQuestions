//returns prime factors without repetition
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
}
public class prime_fact0 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        p o=new p();
        for(int i=1;i<=n;i++){
            if(n%i==0 && o.isPrime(i)==1){
                System.out.println(i);
            }
            else continue;
        }

    }
}