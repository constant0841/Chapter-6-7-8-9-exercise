//💬 문제 설명
//사용자에게 두 개의 정수를 입력받는다.
//두 수를 나눗셈하여 결과를 출력한다.
//입력값이 정수가 아니거나, 0으로 나눌 경우 예외를 처리하시오.

//정수 1 입력: abc
//정수만 입력 가능합니다.
// 또는------
//정수 1 입력: 10
//정수 2 입력: 0
//0으로 나눌 수 없습니다.
import java.util.*;

public class Chapter8_ex8 {
    public static void main (String[] args) {

        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("정수 1 입력 : ");
                int num1 = sc.nextInt();
                System.out.print("정수 2 입력 : ");
                int num2 = sc.nextInt();
                System.out.println(num1 / num2);
            } catch (InputMismatchException e) {
                System.out.println("정수만 입력가능합니다.");
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다.");
            }

            sc.nextLine();
            System.out.println("종료하시겠습니까? yes or no");
            String answer = sc.nextLine();

            if(answer.equalsIgnoreCase("yes")) break;
            else if(!answer.equalsIgnoreCase("no")) continue;
        }
    }
}
