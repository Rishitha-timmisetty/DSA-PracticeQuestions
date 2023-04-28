import java.util.*;
class a{
    int del(int n,int pos,int cap,ArrayList<Integer> al){
        for(int i=pos;i<n-1;i++){
            int j=i+1;
            al.set(i,al.get(j));
        }
        al.set(n-1,0);
        n=n-1;
        System.out.println(al);
        return 1;
        
    }
}
public class array_del {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>(10);
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            al.add(k);
        }
        
        int pos=sc.nextInt();
        System.out.println(al);
        a o=new a();
        o.del(n,pos,10,al);

   }
}
