class numof0 {
    public void c(int f){
    int c=0;
    while(f!=0){
        int l=f%10;
        if(l==0){
            c++;
        }
        f=f/10;
    }
    System.out.println("count:"+c);
}
}
public class numof0s{
    public static void main(String args[]){
        numof0 o=new numof0();
  int a=5,f=1;
 while(a!=0){
    f=f*a;
    a--;
 }
 System.out.println("fact:"+f);
o.c(f);
}
}