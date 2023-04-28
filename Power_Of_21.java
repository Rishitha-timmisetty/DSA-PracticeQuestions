public class Power_Of_21 {
    static boolean inPow2(int n){
        if(n==0) return false;
        while(n!=1){
            if(n%2!=0) {
                System.out.println("false");
                return false;
            }
            n=n/2;
        }
        System.out.println("true");
        return true;
    }
    public static void main(String[] args) {
        int n=5;
        inPow2(n);
    }
}
