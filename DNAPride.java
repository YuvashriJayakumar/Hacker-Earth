
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int T = Integer.parseInt(s.nextLine());               
        if(T>=1 && T<=10000){
            while(T-->0){
                int n=Integer.parseInt(s.nextLine());
                String str=s.nextLine(); 
                if(str.contains("U"))
                    System.out.println("Error RNA nucleobases found!");
                else{
                    char[] c=str.toCharArray();
                    for(int i=0;i<c.length;i++){
                        if(c[i]=='A')
                            c[i]='T';
                        else if(c[i]=='T')
                            c[i]='A';
                        else if(c[i]=='G')
                            c[i]='C';
                        else if(c[i]=='C')
                            c[i]='G';
                        
                    }
                    System.out.println(String.valueOf(c));
                    
                }
            }
        }
    }
}
