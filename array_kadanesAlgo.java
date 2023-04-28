// O(n^2)
// public class array_kadanesAlgo {
//     public static void main(String[] args) {
//     int max=0;  
//     int a[]={-5,4,6,-3,4,-1,-2};
//      for (int i=0;i<a.length;i++){
//         int sum=0;
//       for(int j=i;j<a.length;j++){
//             sum=sum+a[j];
//       if(sum>max){
//         max=sum;
//       }
//     }
//     }
//      System.out.println(max);
//     }
// }
//O(n)-kadenes Algo:
// public class array_kadanesAlgo {
//     public static void main(String[] args) {
//         int sum=0,max=0,a[]={-5,4,6,-3,4,-1,10,20};
//       for(int j=0;j<a.length;j++){
//             sum=sum+a[j];
//       if(sum>max){
//         max=sum;
//       }
//       if(sum<0){
//         sum=0;
//       }
//     }
    
//      System.out.println(max);
//     }      
// }
//O(n)   sum=greatest computed sum till now(a[i])
public class array_kadanesAlgo {
    public static void main(String[] args) {
      int a[]={-5,4,6,-3,4,-1,10,20},max=a[0],sum=a[0];
      for(int j=1;j<a.length;j++){
          sum=Math.max(sum+a[j],a[j]);
          max=Math.max(max,sum);
    }
     System.out.println(max);
    }      
}