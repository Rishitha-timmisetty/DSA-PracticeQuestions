public class EqualSum_3parts {
    // static void Solution(int a[],int n,int k){
    //    int part=0,temp=0;
    //    for(int i=0;i<n;i++){
        // int sum=0;
        // for(int j=i;j<n;j++){
        //     sum+=a[j];
        //     System.out.print(sum+" ");
        // }
        // System.out.println();
    //    }
    // }
    static void Solution(int a[],int n,int k){
        int c=0,temp_sum=0;
        for(int i=0;i<n;i++){
        temp_sum+=a[i];
        if(temp_sum==k){
         temp_sum=0;
          c+=1;
        }
        if(c>=3){System.out.println("True"); return;}
        }
        System.out.println("False");
     }
    public static void main(String[] args) {
    int a[]={1,3,4,0,4},sum=0,k=0;
        for(int i=0;i<a.length;i++){
        sum+=a[i];
    }
    if(sum%3!=0) { System.out.println("False"); return;}
    else{ k=sum/3;Solution(a,a.length,k);}
}
}
