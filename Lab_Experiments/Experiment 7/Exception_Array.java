class Student_Arr {
    String name;
    int roll_no;
    Student_Arr(String name,int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
    public void printing(String s,int rn) {
        System.out.println("Name : +" + s + "Roll no : " + rn);
    }
}
public class Exception_Array {
    public void helper() {
        Student_Arr[] arr = new Student_Arr[10];
        arr[0] = new Student_Arr("Deepanshu",692);
        arr[1] = new Student_Arr("Deepanshu",692);
        arr[2] = new Student_Arr("Deepanshu",692);
        arr[3] = new Student_Arr("Deepanshu",692);
        arr[4] = new Student_Arr("Deepanshu",692);
        arr[5] = new Student_Arr("Deepanshu",692);
        arr[6] = new Student_Arr("Deepanshu",692);
        arr[7] = new Student_Arr("Deepanshu",692);
        arr[8] = new Student_Arr("Deepanshu",692);
        arr[9] = new Student_Arr("Deepanshu",692);
        try {
            arr[10] = new Student_Arr("random",10);
            arr[1].printing("random_code",123);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Please access the correct array index");
        }
    }
    public static void main(String[] args) {
        Exception_Array obj = new Exception_Array();
        obj.helper();
    }
}