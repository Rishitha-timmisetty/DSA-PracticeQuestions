//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    public class lcm_of_n{
        public static void main(String args[]) throws IOException {
            BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            while (t-- > 0) {
                Long n = Long.parseLong(read.readLine());
    
                Solution ob = new Solution();
                System.out.println(ob.numGame(n));
            }
        }
    }
    // } Driver Code Ends
    
    
    class Solution {
        static Long numGame(Long n) {
            // code here
            long r=n;
                int i=1;
                while(true){
                if(r%i==0){
                    i++;
                }
                else r++;
                if(i==n){ 
                    return r;
                }
            } 
           
    }
}