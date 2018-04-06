

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        //Scanner
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        int count=0;
        if(n>=1 && n<=100){
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(s.next());
                if(!(arr[i]>=1 && arr[i]<=100))
                    break;
            }
            
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
