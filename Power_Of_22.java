public class Power_Of_22 {
    //Num. of set bits=1 == n is power of 2
    // public static void main(String[] args) {
    //     int n=1,a[]=new int[256];
    //     for(int i=1;i<256;i++){
    //         a[i]=a[i&(i-1)]+1;
    //     }
    //     int k= a[n&255]+a[(n>>8)&255]+a[(n>>16)&255]+a[(n>>24)];
    //     if(k==1){
    //         System.out.println("true");
    //     }
    //     else{
    //         System.out.println("false");
    //     }
        
    // }
    public static void main(String[] args) {
        int n=1;
        // if(n==0) {System.out.println(0); return;}
        // System.out.println((n&(n-1))==0);
        System.out.println(n!=0 && ((n&(n-1))==0));
    }
    }
