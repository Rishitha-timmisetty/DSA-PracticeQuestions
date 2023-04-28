//a*b=GCD(a,b)*LCM(a,b)
import java.util.Scanner;
public class Lcm_2{
  static int gcd(int a,int b){
    if(b==0) return(a);
    else return gcd(b,a%b);
 }
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int a= sc.nextInt(),b=sc.nextInt();
 int k = gcd(a,b);
 int Lcm = (a*b)/k;
 System.out.println(Lcm);
 }
}
