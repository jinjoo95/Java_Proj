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
		
		
	//2. System.out.print();    <== 출력 후 개행하지 않는다. 
		
		System.out.println("안녕");
		System.out.println("하세요\n");
		
		System.out.println("=============================");
		
	// 3. System.out.printf();     <-- 자료형 포맷에 따라 출력을 할 수 있다.
		System.out.printf("%d\n", 30);       //%d  : 10진수로 출력
		System.out.printf("%o\n", 30);   // %o  : 8진수로 출력
		System.out.printf("%x\n", 30);   // %x : 16진수로 출력
	  	
		System.out.printf("%s \n" , "문자열 출력");  // %s 문자열을 출력
		System.out.printf("%f \n", 5.8);            //%f 실수를 가지고 올떄
		System.out.printf("4.2f \n, 5.8");         // %4.2f : 전체 4자리 소수점이하 2자리
		System.out.printf("%d 와 %4.2f 를 출력 합니다. " , 4, 5.8 );
   
}
}