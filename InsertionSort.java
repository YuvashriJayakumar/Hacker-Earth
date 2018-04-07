
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        if(n>=1 && n<=100){
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=Integer.parseInt(s.next());
            int[] dest=Arrays.copyOf(arr,n);
            for(int i=0;i<n;i++){
                int temp=arr[i];
                int j=i;
                while(j>0 && temp<arr[j-1]){
                    arr[j]=arr[j-1];
                    
                    j--;
                }
                arr[j]=temp;
                
            }
            HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
            for(int i=0;i<n;i++){
                map.put(arr[i],i+1);
            }
            for(int i=0;i<n;i++){
                System.out.print(map.get(dest[i])+" ");
            }
                
                   
        }
        
    }
}
