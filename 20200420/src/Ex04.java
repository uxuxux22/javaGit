
public class Ex04 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		String c = ""; // 글자 출력을 위한 String 사용
		
		c = a>b? "a가 큽니다":"b가 큽니다"; // 식이 참이면 처음 거, 식이 거짓이면 뒤에걸로 반환함. ex) a= b<c? "" : ""
		int d = a>b? 1:0; //식이 참이면 1, 거짓이면 0 으로 반환.(인트값이라 숫자만 가능함)
		
		System.out.println(c);
		// System.out.println(a>b? "a가 큽니다":"b가 큽니다");  / 같은 말 =  ("c = " +(a>b? "a가 큽니다":"b가 큽니다"));
		System.out.println("d = "+d);
	}
	
}
