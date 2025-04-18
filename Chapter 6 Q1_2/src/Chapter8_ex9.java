//사용자에게 정수 두 개를 입력받아 나눗셈 결과를 출력한다.
//입력 값이 정수가 아니거나, 0으로 나누면 예외 메시지를 출력한다.
//무슨 일이 있더라도 "프로그램 종료"를 마지막에 출력해야 한다.
import java.util.*;

public class Chapter8_ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("정수 1 입력 : ");
            int num1 = sc.nextInt();
            System.out.print("정수 2 입력 : ");
            int num2 = sc.nextInt();
            int div = num1 / num2;
            System.out.println("결과 : " + div);
        }
        catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }
        catch (InputMismatchException e){
            System.out.println("정수만 입력해주세요");
        }
        finally{
            System.out.println("프로그램 종료");
            sc.close();
        }
    }
}


//        💡 출력 예시
//정상 입력 시:
//
//makefile
//정수 1 입력: 10
//정수 2 입력: 2
//결과: 5
//프로그램 종료
//예외 발생 시:
//
//정수 1 입력: 10
//정수 2 입력: 0
//        0으로 나눌 수 없습니다.
//프로그램 종료
//또는:
//정수 1 입력: hi
//정수만 입력해주세요.

//프로그램 종료
