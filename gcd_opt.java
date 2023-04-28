class gcd{
    public int gcd_(int a,int b){
    if(b==0){
    System.out.println(a);
    return a;
    }
    else{
    return gcd_(b,a%b);
    }
    }

}
public class gcd_opt {
      public static void main(String args[]){
      int a=12,b=15;
      gcd g= new gcd();
      g.gcd_(a,b);  
    }
}
