
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            
            
            arr[i]=Integer.parseInt(s.next());
        }
        int q=s.nextInt();
        int[] qarr=new int[q];
        for(int i=0;i<q;i++){
            qarr[i]=Integer.parseInt(s.next());
        }
        Arrays.sort(arr);
        for(int i=0;i<q;i++){
             qarr[i]=search(0,arr.length-1,qarr[i],arr)+1;
            System.out.println(qarr[i]);
        }
        


    }
    
    private static int search(int low,int high,int s,int[] arr){
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<s){
                low=mid+1;
            }
            else if(arr[mid]>s){
                high=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
