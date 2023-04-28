////O(n^2)
// public class array_longest_evenodd {
//     public static void main(String[] args) {
//         int max=0;
//         int a[]={5,10,20,6,3,8};
//         for(int j=0;j<a.length;j++){
//             int c=1;
//         for(int i=j+1;i<a.length;i++){
//             if(a[i-1]%2==0 && a[i]%2!=0 || a[i-1]%2!=0 && a[i]%2==0){
//                 c++;
//             }
//             else break;
//         }
//         if(c>max){
//             max=c;
//         }
//     }
//         System.out.println(max);
//     }
// }
//O(n):
public class array_longest_evenodd {
        public static void main(String[] args) {
            int max=0;
            int a[]={5,10,20,6,3,8};
            int c=1;
            for(int i=1;i<a.length;i++){
                if(a[i-1]%2==0 && a[i]%2!=0 || a[i-1]%2!=0 && a[i]%2==0){
                    c++;
                }
                else c=1;
            if(c>max){
                max=c;
            }
        }
            System.out.println(max);
        }
    }
