class rough{
public static void main(String[] args) {
    int N=6;
    exactly3Divisors(N);
}
    public static int numberofdivs(int n,int k){
        System.out.println("n="+ n);
            for(int j=1;j<=n;j++){
                System.out.println("j="+ j+" ");
                if(n%j==0){
                    k++;
                    System.out.println("k="+ k +" ");
                }
            }
            System.out.println("\n");
            return k;
        }
    public static int exactly3Divisors(int N)
    {
        //Your code here
        int count=0;
        for(int i=1;i<=N;i++){
            int k=0;
            if(numberofdivs(i,k)==3){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}