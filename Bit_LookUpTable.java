public class Bit_LookUpTable{
 public static void main(String[] args) {
    int table[]=new int[256],n=1;
    for(int i=1;i<256;i++){
        table[i]=table[i&(i-1)]+1;
        //table[i]=table[i/2]+(i&1);
    }
    System.out.println(table[n&255]+table[(n>>8)&255]+table[(n>>16)&255]+table[(n>>24)]);
} 
}    