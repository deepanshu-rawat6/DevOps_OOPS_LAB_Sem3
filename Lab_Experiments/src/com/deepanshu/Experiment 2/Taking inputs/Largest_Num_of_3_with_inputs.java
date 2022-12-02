
public class Largest_Num_of_3_with_inputs{
	int greatest(int a,int b,int c){
		int max=a;
		if(max<b) max=b;
		if(max<c) max=c;
		return max;
	}
	public static void main(String[] args){
		int ans;
		Largest_Num_of_3_with_inputs obj=new Largest_Num_of_3_with_inputs();
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		ans=obj.greatest(a,b,c);
		System.out.println(ans);
	}
}