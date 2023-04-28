//min(a,b)-time
import java.lang.Math;
import java.util.Scanner;
public class gcd_1{
    static void hcf2(int a,int b){
        {
            int r=Math.min(a,b);
            while(r!=0){
                if(a%r==0 && b%r==0){
                    break;
                }
                r--;
            }
            System.out.println(r);
        }
    } 
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        hcf2(a,b);
    }
}

