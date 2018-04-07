
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr=new int[n];
        ArrayList<Integer> zombies=new ArrayList<Integer>();
        ArrayList<Integer> vampires=new ArrayList<Integer>();
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s.next());
            if(arr[i]%2==0){
                zombies.add(arr[i]);
                sum1+=arr[i];
            }else{
                vampires.add(arr[i]);
                sum2+=arr[i];
            }
        }
        Collections.sort(zombies);
        Collections.sort(vampires);
        for(Integer i:zombies)
            System.out.print(i+" ");
        System.out.print(sum1+" ");
        for(Integer i:vampires)
            System.out.print(i+" ");
        System.out.print(sum2+" ");

    }
}
