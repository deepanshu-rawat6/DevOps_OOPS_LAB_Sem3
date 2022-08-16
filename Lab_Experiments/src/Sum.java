public class Sum {
    int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        int ans;
        Sum s1=new Sum();
        ans=s1.add(10,20);
        System.out.println(ans);
    }
}
