
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());
        String[] c=new String[n];
        int[] op=new int[n];
        for(int i=0;i<n;i++){
            c[i]=s.nextLine();
            String temp=c[i];
            int j=i;
            int count=0;
            while(j>0){
                if(temp.compareTo(c[j-1])>0)
                    count++;
                j=j-1;
            }
            op[i]=count;
        }
        for(int i=0;i<n;i++){
            System.out.println(op[i]);
        }
    }
}
