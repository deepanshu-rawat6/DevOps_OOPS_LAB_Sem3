import java.util.Scanner;

public class Permutations {
    void compute(){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[3];
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(i!=j && j!=k && i!=k){
                        System.out.println(arr[i]+""+arr[j]+""+arr[k]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Permutations obj=new Permutations();
        obj.compute();
    }
}
