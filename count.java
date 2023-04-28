import java.util.*;
class count{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int a=sc.nextInt();int c=0;
            while(a!=0){
                a=a/10;
                c++;
            }
            System.out.println(c);
    }
}