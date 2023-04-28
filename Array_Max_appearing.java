//O(N*Max)-time complexity
public class Array_Max_appearing {
    public static void main(String[] args) {
        int left[]={1,2,5,15};
        int right[]={5,8,7,18};
        int freq[]=new int [100];
        for(int j=0;j<4;j++){
        for(int i=left[j];i<=right[j];i++){
          freq[i]+=1;
          }
        }
        int max=0;
        for(int j=1;j<100;j++){
          if(freq[j]>freq[max]){
            max=j;
          }
        }
          System.out.println(max);
        }
    }

