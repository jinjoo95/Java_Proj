package chapter02.scanner;

import java.util.Scanner; 

public class Ex01 {
	public static void main(String[] args) {
		
		// 18:00까지 완료.
		
		//1. Scanner 등록
		//2. 아버님 이름 , 어머님 이름 , 형제이름, 자신이름    : sc.next();
		    // 아버님나이 , 어머님 나이 , 형제 나이, 자신의 나이 : sc.nextInt();
		//3. 스케너로 받은 변수의 값을 출력
		//4. 전체 나이의 합계, 평균을 구해서 소숫점이하 2 자리까지만 출력
		
         Scanner sc = new Scanner(System.in);
         
         
         String fa;    //아빠이름
         String ma;    //엄마 이름
         String ss1;   //큰언니 이름
         String ss2;   //작은언니 이름
         String name;  //이름
         
         int f;     //아빠 나이
         int m;     //엄마나이
         int s1;   //큰언니 나이
         int s2;   //작은언니 나이
         int me;    //자신 나이
         
         System.out.println("아빠의 이름을 입력하세요>>>");
         fa = sc.next();
         System.out.println("엄마의 이름을 입력하세요>>>");
         ma = sc.next();
         System.out.println("큰언니의 이름을 입력하세요>>>");
         ss1 = sc.next();
         System.out.println("작은언니의 이름을 입력하세요>>>");
         ss2 = sc.next();
         System.out.println("자신의 이름을 입력하세요>>>");
         name = sc.next();
         
         //System.out.println("아빠이름 엄마이름 형제이름 나의 이름을 공백을 구분해서 입력하세요>>>>")==> 한꺼번에 가능;
         
         System.out.println("아빠의 나이를 입력하세요>>>");
         f = sc.nextInt();
         System.out.println("엄마의 나이를 입력하세요>>>");
         m = sc.nextInt();
         System.out.println("큰언니의 나이를 입력하세요>>>");
         s1 = sc.nextInt();
         System.out.println("작은언니의 나이를 입력하세요>>>");
         s2 = sc.nextInt();
         System.out.println("자신의 나이를 입력하세요>>>");
         me = sc.nextInt();
         
         //System.out.println("아빠나이 엄마나이 형제나이 나의 나이을 공백을 구분해서 정수로 입력하세요>>>>")==>한꺼번에 가능;
         
         int sum = f + m + s1 + s2 + me;
         double avg = sum / 5.0 ;
         
         System.out.printf("아빠이름는 %s 이고, 엄마이름는 %s 이고, 큰언니 이름는 %s 이고, 작은언니이름은 %s 이고, 자신의 이름은 %s 이고, 아빠나이는 %d 이고, 엄마나이는%d 이고, 큰언니 나이는 %d 이고, 작은언니나이는 %d 이고 자신의 나이는 %d 입니다" ,
        		 fa, ma , ss1, ss2 , name , f , m , s1 , s2, me );
         System.out.printf("%s 의 나이의 합dms %d 이고, 평균은 %5.2f 입니다" , name ,sum , avg);
         
         
         
         
       
         
         
         
         
        		 
		
		
		
		
	}

}
