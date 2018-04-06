/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        int count=0;
        boolean flag=true;
        if(t>=1 && t<=10){
            while(t-->0){
            int n=Integer.parseInt(s.next());
            int m=Integer.parseInt(s.next());
            if(n>=1 && n<=1000 && m<=n){
                int[] arr=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=Integer.parseInt(s.next());
                    if(!(arr[i]>=1 && arr[i]<=1000))
                        flag=false;
                }
                if(flag){
                for(int i=0;i<n-1;i++){
                    for(int j=0;j<n-i-1;j++){
                        if(arr[j]>arr[j+1]){
                            int temp=arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=temp;
                        }
                    }
                }
                int minSum=0,maxSum=0;
                for(int i=0;i<n-m;i++){
                    minSum+=arr[i];
                }
                for(int i=m;i<n;i++){
                    maxSum+=arr[i];
                }
                System.out.println(maxSum-minSum);
                }
            }
        }
        }

    }
}
