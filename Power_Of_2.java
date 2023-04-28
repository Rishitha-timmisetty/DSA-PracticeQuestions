public class Power_Of_2 {
    public static void main(String[] args) {
        int n=0,p=1;
        for(int i=0;i<n;i++){
            p*=2;
            if(p==n){
                System.out.println("True");
                return;
            }
            if(p>n){
                return;
            }
        }
        System.out.println("False");
    }
}
