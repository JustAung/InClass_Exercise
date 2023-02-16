
public class OverrideExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child kid = new Child();
		kid.message();
		kid.message(null);
		kid.liar();
		//one is because thats what the child prints out
		//second is simply null or you can put a string in here and it'll print it out
		//third is calling the superclass message from parent
	}

}
