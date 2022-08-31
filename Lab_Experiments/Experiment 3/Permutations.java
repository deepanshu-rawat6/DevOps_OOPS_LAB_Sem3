import java.util.HashSet;
import java.util.Scanner;

public class Permutations {
    void compute(){
        HashSet<String>s=new HashSet<String>();
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[3];
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
        int c=0;
        System.out.println("\nPermutations are as follows:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(i!=j && j!=k && i!=k){
                        s.add(arr[i]+""+arr[j]+""+arr[k]);
                    }
                }
            }
        }
        c=s.size();
        System.out.println(s);
        System.out.println("There are total "+c+" permutations of "+arr[0]+""+arr[1]+""+arr[2]);
    }
    public static void main(String[] args) {
        Permutations obj=new Permutations();
        obj.compute();
    }
}
