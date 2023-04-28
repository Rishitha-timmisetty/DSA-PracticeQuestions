public class Bitwise_op1 {
    public static void main(String[] args) {
        int k=3,n=4;
        for(int i=0;i<k-1;i++){
            n=n/2;
        }
        if((n&1)!=0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
