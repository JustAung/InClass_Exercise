
public class Child extends Parent{

	public Child() {
		
	}
	public void message() 
	{
		System.out.println("I am the child class");
	}
	public void message(String m) 
	{
		System.out.println(m);
	}
	public void liar() 
	{
		super.message();
	}
}
