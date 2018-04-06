
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.next());
        int x = Integer.parseInt(s.next());
        if(n>=1 && n<=100 && x>=1 && x<=n){
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(s.next());
            }
            
                for(int i=0;i<x;i++){
                    int min=arr[i];
                    int index=i;
                    for(int j=i+1;j<n;j++){
                        if(arr[j]<min){
                            min=arr[j];
                            index=j;
                        }
                            
                    }
                    if(arr[i]!=min){
                        int temp=arr[i];
                        arr[i]=arr[index];
                        arr[index]=temp;
                    }
                }
            
            for(int i=0;i<n;i++){
             System.out.print(arr[i]+" ");   
            }
        }
        
    }
}
