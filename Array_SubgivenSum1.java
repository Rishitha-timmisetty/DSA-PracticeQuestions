//O(n)
public class Array_SubgivenSum1 {
    public static void main(String[] args) {
        int a[]={33,1,4,20,3,10,0,33};
        int sum=33,st=0;//int curr=a[0];
        // int e=0;
        // while(e!=a.length){
        //     if(curr<=sum) {curr+=a[e+1];e+=1;}
        //     else {curr-=a[st];st+=1;}
        //     if(curr==sum){
        //         System.out.println("Yes");
        //         return;
        //     }
        // }
        //     System.out.println("No");
        int curr=0;
        for(int e=0;e<a.length;e++){
            if(curr<sum){
            curr+=a[e];
            }
            else {
                curr-=a[st];
                st+=1;
            }
            if(curr==sum){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
