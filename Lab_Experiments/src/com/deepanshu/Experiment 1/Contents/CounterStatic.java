class CounterStatic{  
static int count=0;//will get memory only once and retain its value  
  
CounterStatic(){  
count++;//incrementing the value of static variable  
System.out.println(count);  
}  
  
public static void main(String args[]){  
//creating objects  
CounterStatic c1=new CounterStatic();  
CounterStatic c2=new CounterStatic();  
CounterStatic c3=new CounterStatic();  
}  
}  
