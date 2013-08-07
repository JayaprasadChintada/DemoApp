public class A{
	public static void main(String[] args){
		System.out.println("Hello World");
	}
	static{
		System.out.println("Stati block will be executed first");
	}
	{
		System.out.println("Non static blocks are executed at the time of instantiation ");
	}
	
}