
public class bb {

	public static void main(String[] args) {
		
		int i=0;
		
		while(i < 10) {
			int j =0;
			while (j < 10) {
				if(i+j == 9) {
					System.out.println("  "+i+" "+j);
					System.out.println("+ "+j+" "+i);
					System.out.println("-----");
					System.out.println("  "+9+" "+9);
					j++;
				}
				else {
					j++;
					continue;
				}
			}
			i++;
			System.out.println();
		}
		
	}
	
}
