
public class aa {

	public static void main(String[] args) {
		
		int i=2;
		
		while(i < 10) {
			
			int j=1;
			
			while(j < i+1) {
				System.out.println( i+"x"+j+"="+i*j);
				j++;
			}
			
			i = i+2;
			System.out.println();
		}		
	}	
}
