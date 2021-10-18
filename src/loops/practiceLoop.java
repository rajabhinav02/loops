package loops;

public class practiceLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int k=1;
	
	for (int i=0; i< 4; i++) {
		
		for (int j =1; j<= 1+i; j++) {
			
			System.out.print(k);
			System.out.print("\t");
			k++;
		}
		
		System.out.println("");
		
	}
	
	System.out.println("#####");
	
	int n = 1;
	
	for (int l=0; l<4; l++) {
		for (int m =1; m<= 4-l; m++) {
			
			System.out.print(n);
			System.out.print("\t");
			n++;
			
		}
		System.out.println("");
	}
	
	System.out.println("#####");
	
	int v = 3;
	
	for (int x=1; x < 4; x++) {
		
		for (int y=1; y<=x; y++) {
	
	System.out.print(v);
	System.out.print("\t");
	v=v+3;
	
	

	}
		System.out.println("");

	
	}
	}
}
