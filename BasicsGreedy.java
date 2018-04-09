
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int t=Integer.parseInt(s.nextLine());
        int[] res=new int[t];
        for(int j=0;j<t;j++){
            int n=Integer.parseInt(s.next());
            int c=Integer.parseInt(s.next());
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                    arr[i]=Integer.parseInt(s.next());
            }
            Arrays.sort(arr);
            int sum=0;
            int count=0;
            for(int i=0;i<n;i++){
                sum+=arr[i];
                if(sum<=c){
                    count++;
                }
                    
                else
                    break;
            }
        res[j]=count;
            
    }
    for(int j=0;j<t;j++)
        System.out.println(res[j]);
    }
}
