//사용자에게 두 개의 정수를 입력받아
//나눗셈 결과를 출력하는 프로그램을 작성하시오.
//단, 0으로 나누는 경우 "0으로 나눌 수 없습니다." 라는 메시지를 출력하고
//정상적으로 종료되도록 예외 처리를 하시오.
import java.util.Scanner;

public class Chapter8_ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("정수1 입력 : ");
            int num1 = sc.nextInt();

            System.out.print("정수2 입력 : ");
            int num2 = sc.nextInt();

            System.out.println(num1/num2);
        }catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }

    }
}
