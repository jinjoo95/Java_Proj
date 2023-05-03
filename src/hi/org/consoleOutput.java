package hi.org;
//패키지 : 클래스 파일이 저장될 폴더 구저



public class consoleOutput {
	public static void main(String[] args)  {
		// main 메소드 블락에서 프로그램 작성
		
		//1. System.out.println ();
		
		//문자열 출력
		System.out.println("안녕하세요");
		
		System.out.println("오늘은" + "날씨가 매우 맑습니다");
				
		
		//정수 출력 : ""를 처리 안함.
		System.out.println("2" + "4");
		
		// 정수출력 : "" 를 처리 안함.
		System.out.println(2 + 4);
		
		//실수 출력 : ""를 처리 하징 않는다.
		System.out.println("11.5" + 11.5);
		
		//문자열 + 실수 ==> 문자열
		System.out.println("11.5" + 11.5);
		
	//===================================================
		// 문자열과 숫자 를 할때 : 연결
		System.out.println("문자열" + 3 + 4 + 5);
	
		// 정수 + 정수 + 정수 + "문자열"
		//자료형 변수명 = 초기값 ;
		
		String str = "안녕하세요 ";
		
		System.out.println(str);
		
		//정수를 담는 자료형 : int
		int a = 10 ;
		int b = 20 ;
		
		System.out.println( a + b );
		
		// 정수 + 정수 + 정수 + "문자열"
		System.out.println(3 + 4 + 5 + "문자열");
		
		//변수 선언 :
		//자료형 변수명 = 초기값 ;
		//String str = null;
		System.out.println("");

}
}