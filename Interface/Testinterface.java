package Interface;

public class Testinterface implements printable, printable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Testinterface t=new Testinterface();
		t.draw();
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("Example of Interface");
		
	}

}
