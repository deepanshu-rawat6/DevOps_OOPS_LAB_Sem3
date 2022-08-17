import java.util.*;
public class Sum{
	int add(int a,int b){
		return a+b;
	}
	public static void main(String[] args){
		int ans;
		Sum obj=new Sum();
		ans=obj.add(10,10);
		System.out.println(ans);
	}
}