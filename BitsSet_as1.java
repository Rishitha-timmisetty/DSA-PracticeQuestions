//theta(d) where d is the no. of bits from last to MSB(most significant bit)
public class BitsSet_as1 {
    public static void main(String[] args) {
        int n=13,c=0;
        while(n!=0){
            if((n&1)!=0)/*(n%2==1)*/{
                c++;
            }
            //or c=c+(n&1);
            n=n/2; 
        }
        System.out.println(c);
    }
}
