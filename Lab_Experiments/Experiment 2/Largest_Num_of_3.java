
public class Largest_Num_of_3{
	int greatest(int a,int b,int c){
		int max=a;
		if(max<b) max=b;
		if(max<c) max=c;
		return max;
	}
	public static void main(String[] args){
		int ans;
		Largest_Num_of_3 obj=new Largest_Num_of_3();
		ans=obj.greatest(10,2,3);
		System.out.println(ans);
	}
}