package demo;

public class ConstructorDemo {
	int a=10;
	ConstructorDemo(){
		a=100;
		System.out.println(a);
	}
	ConstructorDemo(int b){
		a=100;
		System.out.println(a+b);
	}
	ConstructorDemo(int b,int c){
		a=100;
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		ConstructorDemo obj= new ConstructorDemo();	
		ConstructorDemo obj1= new ConstructorDemo(20);	
		ConstructorDemo obj2= new ConstructorDemo(20,30);	

	}
}
