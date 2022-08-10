public class For_loop_args{
	public static void main(String[] args){
		System.out.println("Hello World!");
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
	}
}
/* Alternative approach:
 *   
 * 	  for(String str:args){
 * 			System.out.println(str);
 * 	  }
 */

