public class SI {
    double Interest(double p,double r,double t){
        return (p*r*t)/100;
    }

    public static void main(String[] args) {
        double i;
        SI obj=new SI();
        i=obj.Interest(100,5.5,20);
        System.out.println(i);
    }
}
