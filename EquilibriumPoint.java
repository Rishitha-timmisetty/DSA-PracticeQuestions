import javax.swing.SortOrder;

// work-N; space-N; Time-N
//public class EquilibriumPoint {
//     static void preprocess(int a[],int p[]){
//         int sum=0;
//         p[0]=a[0];
//         for(int i=1;i<a.length;i++){
//         p[i]=p[i-1]+a[i];
//         }
//     }
//     public static void main(String[] args) {
//         int a[]={2,-2,4};
//         int p[]=new int[a.length];
//         preprocess(a,p);
//         if(p[a.length-1]-p[0]==0){
//             System.out.println("True at 0");
//             return;
//         }
//         for(int i=1;i<a.length;i++){
//             if(p[i-1]==p[a.length-1]-p[i]){
//                 System.out.println("True at "+ i);
//                 return;
//             }
//         }
//         System.out.println("False");
//     }
// }

public class EquilibriumPoint {
    public static void main(String[] args) {
        int a[]={3,4,8,-9,20,6};
        int ls=0,rs=0;
        for(int i=0;i<a.length;i++){
            rs+=a[i];
        }
        for(int i=0;i<a.length;i++){
            rs-=a[i];
            if(ls==rs){System.out.println("Yes at "+ i); return; }
            else{
                ls+=a[i];
            }
        }
        System.out.println("No");
    }
}