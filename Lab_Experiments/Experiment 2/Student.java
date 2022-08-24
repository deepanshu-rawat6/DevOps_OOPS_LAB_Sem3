import java.util.Scanner;

public class Student {
    void input_sort_display(){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]= sc.nextInt();
        }
//        Used Insertion Sort here
//        Insertion sort starts
        for(int i=1;i<10;i++){
            int j=i-1;
            int key=arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
//        Insertion sort ends here
        String[] grades=new String[10];
        for (int i=0;i<10;i++){
            if(arr[i]<=40){
                grades[i]="FAIL";
            }else if(arr[i]>40 && arr[i]<=50){
                grades[i]="PASS";
            }else if(arr[i]>50 && arr[i]<=75){
                grades[i]="MERIT";
            }else{
                grades[i]="DISTINCTION";
            }
        }
        System.out.println("Marks\tGrades");
        for(int i=0;i<10;i++){
            System.out.println(arr[i]+"\t\t"+grades[i]);
        }
    }
    public static void main(String[] args) {
        Student obj=new Student();
        obj.input_sort_display();
    }
}
