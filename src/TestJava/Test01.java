package TestJava;
import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {
		// 나이를 저장할 변수 선언
        int myAge;
        // 나이를 초기화
        myAge = 20; //초기값 설정
        System.out.println("저의 나이는 "+ myAge +"살이고 제 이름은 오주현입니다.");
        // 나이를 변경할 입력을 받기 위해 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 변경할 나이를 입력 받음
        System.out.print("변경할 나이를 입력하세요: ");
        myAge = scanner.nextInt();

        // 변경된 나이 출력
        System.out.println("변경된 나이는 " + myAge + "살입니다.");

        // Scanner 객체 닫기
        scanner.close();

		
		
		
		
	}

}
