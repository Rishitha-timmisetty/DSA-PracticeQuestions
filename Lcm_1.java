//time complexity=O(a*b-max(a,b))
import java.util.Scanner;
import java.lang.Math;
public class Lcm_1{
    static int Lcm(int a,int b){ 
        int r= Math.max(a,b);
        while(true){
        if(r%a==0 && r%b==0){System.out.println(r);return r;}
        r++;
        }
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        Lcm(a,b);
       }
}
