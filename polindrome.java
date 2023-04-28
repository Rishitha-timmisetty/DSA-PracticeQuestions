import java.util.Scanner;
class polindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt(),s=0,p=a,r;
        while(a!=0){
            r=a%10;
            s=s*10+r;
            a=a/10;
        }
        if(s==p){
            System.out.println("p");
        }
        else{
            System.out.println("not p");
        }
    }
}