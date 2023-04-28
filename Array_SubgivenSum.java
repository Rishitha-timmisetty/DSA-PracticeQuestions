//O(n^2)-Naive Solution
public class Array_SubgivenSum {
    public static void main(String[] args) {
        int a[]={1,4,0,0,3,10,6},sum=6;
        for(int i=0;i<a.length;i++){
            int s=0;
            for(int j=i;j<a.length;j++){
                s+=a[j];
                if(s==sum){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
        return;
    }
}
