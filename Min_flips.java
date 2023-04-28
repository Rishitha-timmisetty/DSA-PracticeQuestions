class Flip{
    int count0=0,count1=0;
    public void print(int value,int a[]){
      for(int i=0;i<a.length-1;i++){
        if(a[i]!=value && a[i]!=a[i+1]){
            System.out.print("\n From "+(i+1)); 
        }
      else if(a[i]==value && a[i]!=a[i+1]){
        System.out.print(" to "+i);
   }
    }
}
    public void flips(){
        int a[]={1,0,1,1,0,0,1};
        if(a[0]==1){
            count1+=1;
        }
        if(a[0]==0){
            count0+=1;
        }
        for(int i=1;i<a.length;i++){
            if(a[i]==0 && a[i-1]!=a[i]){
               count0+=1;
            }
            else if(a[i]==1 && a[i-1]!=a[i]){
                count1+=1;
            }
        }
        System.out.println(Math.min(count0,count1));
        if(Math.min(count0,count1)==count1) {
            print(1,a);
            return;
        }
        else {
            print(0,a);
            return;}
}
}
public class Min_flips {
    public static void main(String[] args) {
        Flip flip=new Flip();
        flip.flips();

    }
}
