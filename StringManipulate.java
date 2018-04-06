
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        int n=Integer.parseInt(s.next());
        if(n>=1 && n<=1000){
        String[] arr=new String[n];
        for(int k=0;k<n;k++){
            String name = s.next();
            if(name.length()>=1 && name.length()<=10000){
                int a=Integer.parseInt(s.next());
                int b=Integer.parseInt(s.next());
                if(a>=0 && b>=a && b<name.length()){
                    char[] sub=name.substring(a,b+1).toCharArray();
                    Arrays.sort(sub);
                    
                    arr[k]=name.substring(0,a)+new StringBuilder(String.valueOf(sub)).reverse()+name.substring(b+1);
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    }
}
