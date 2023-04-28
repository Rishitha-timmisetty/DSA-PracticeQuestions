public class Min_flips1 {
    public static void main(String[] args){
        int a[]={1,0,0,1};
        for(int i=1;i<a.length;i++){
            if(a[i]!=a[i-1]){
                if(a[i]!=a[0]){
                System.out.print("From "+i+" to ");
                }
            else{
                System.out.println(i-1);
            }
        }
        }
        if(a[a.length-1]!=a[0]){
            System.out.println((a.length-1)+"\n");
        }
    }
}
