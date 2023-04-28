//theta(n+max)-time complexity
public class Array_Max_appearing1 {
    static void Prefix_Sum(int a[]){
        for(int i=1;i<100;i++){
            a[i]+=a[i-1];
        }        
    }
    public static void main(String[] args) {
        int left[]={1,2,4},right[]={4,5,7};
        int freq[]=new int[101];
        for(int i=0;i<left.length;i++){
            freq[left[i]]++;
            freq[right[i]+1]--;
        }
        Prefix_Sum(freq);
        int max=0;
        for(int j=1;j<100;j++){
          if(freq[j]>freq[max]){
            max=j;
          }
        }
        System.out.println(max);
    }
}