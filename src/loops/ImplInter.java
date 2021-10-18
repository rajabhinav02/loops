package loops;

public class ImplInter implements TrafficL, Train  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrafficL tl = new ImplInter();
		tl.greenLight();
		tl.redLight();
		
		ImplInter ii = new ImplInter();
		ii.Yellow();
		
		
		Train rt = new ImplInter();
		rt.Train();
		
		
		
	}

	@Override
	public void redLight() {
		// TODO Auto-generated method stub
		System.out.println("Red");
		
	}

	@Override
	public void greenLight() {
		// TODO Auto-generated method stub
		System.out.println("Green");
	}

	public void Yellow() {
		System.out.println("Yellow");
	}

	@Override
	public void Train() {
		// TODO Auto-generated method stub
		System.out.println("Train running");
		
	}
}
