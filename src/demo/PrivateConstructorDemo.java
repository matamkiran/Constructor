package demo;


public class PrivateConstructorDemo {
	
	private PrivateConstructorDemo(){
		System.out.println("hello am constructor");
	}
	
	public static void main(String[] args) {
		PrivateConstructorDemo obj= new PrivateConstructorDemo();
	}

}
