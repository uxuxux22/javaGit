import java.util.Scanner; //scanner 사용시 꼭 작성해줘야함

public class Ex05 {

	public static void main(String[] args) {

		System.out.println("스위치 공부해야됨");
		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();

		/* 라인 자동 정렬 : ctrl + shift + f
		 * 
		 * switch ~ case 구문
		 */

		switch (input) {
		case 1:
			System.out.println("1 입력했네요");
			break;
		case 2:
			System.out.println("2 입력했네요");
			break;
		case 3:
			System.out.println("3 입력했네요");
			break;
		default:
			System.out.println("1,2,3 제외 다른 수를 입력했네요");
			break;
		}
	}

}
