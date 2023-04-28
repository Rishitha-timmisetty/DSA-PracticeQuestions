//O(n)
import java.util.Scanner;
class a{
    public int p(int n){
     if(n==1){
        System.out.println(0);
     return 0;
    }
     else{
     for(int i=2;i<n;i++){
     if(n%i==0){
        System.out.println(0);
        return 0;    
    }
    }
    System.out.println(1);
    return 1;
}
}
}
public class prime_1 {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    a o=new a();
    o.p(t);
    }
}
