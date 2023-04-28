public class left_rotation {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int t=a[0];
        for(int i=0;i<6;i++){
            if(i==5){
                a[i]=t;
            }
            else a[i]=a[i+1];
        }
        for(int i=0;i<6;i++){
            System.out.println(a[i]);
        }
    }
}
