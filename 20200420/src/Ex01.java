import java.util.Scanner;

/* 
 * yum install java1.8* -y
 * 
 * javac명령어로 컴파일 하는 것
 * 이클립스를 사용하기떔누에 자동 컴파일이 된다 
 * java Ex01.class 로 실행
 * 
 * debug(디버그)는 이클립스에서 사용하는 개발자 개발도구
 * F6 라인진행
 * f11 디버그 실행
 * F8 디버그 모드 종료 or 다음 브레이크 포인트까지 진행
 * 
 */

public class Ex01 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		/* 
		 * char a[30];
		 * fgets( a, stdin);
		 * 
		 */
	
		System.out.println("입력하세요");
		Scanner scan = new Scanner(System.in);
		String inputValue = scan.nextLine();
		System.out.println("inputValue = "+inputValue);
		
	}
	
}
