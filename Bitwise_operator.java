public class Bitwise_operator {
    public static void main(String[] args) {
        int k=3,n=4;
    //1// int p=1;
    //    for(int i=0;i<k-1;i++){
        //     p*=2;
        // }
    //2// n=(n>>k-1);
          int p =1<<k-1;
     //1// if ((n&p)!=0){
        //     System.out.println("Yes");
        // }
    //2//   if ((n&1)!=0){
    //            System.out.println("Yes");
    //        }
            if ((n&p)!=0){
                System.out.println("Yes");
            }
        else{
            System.out.println("No");
        }
    }
}
