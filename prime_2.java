
import java.lang.Math;
import java.util.Scanner;
public class prime_2{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    System.out.println("np");
                    return;
                } 
                else{
                   continue;
                }
            }
        }
        System.out.println("p");
        return;
    }
}
