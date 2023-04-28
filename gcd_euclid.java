//time complexity=
import java.util.Scanner;
public class gcd_euclid{
     public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        while(a!=b){
            if(a>b){
                a = a-b;
            }
            else{
                b = b-a;
            }
        }
        System.out.println(b);
     }
}