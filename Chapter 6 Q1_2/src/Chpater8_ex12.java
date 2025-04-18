//사용자에게 나이를 입력받는다.
//나이가 0 미만 또는 150 초과일 경우 throw를 사용해 예외를 발생시킨다.
//이때 사용할 예외는 IllegalArgumentException (표준 예외!)
//예외가 발생하면 "잘못된 나이입니다." 출력
//예외가 없으면 "나이 입력 완료: X세" 출력
import java.util.*;

public class Chpater8_ex12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요");

        try{
            int age = sc.nextInt();
            if(age < 0 || age > 150){
                throw new IllegalArgumentException("잘못된 나이입니다!");
            }
            System.out.println("나이 입력 완료 : " + age + "세");
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("숫자를 입력해주세요.");
        }
        sc.close();
    }
}
//💡 예시 출력
//정상 입력:
//나이를 입력하세요: 25
//나이 입력 완료: 25세
//예외 발생:
//
//나이를 입력하세요: -5
//잘못된 나이입니다.
//또는:
//
//나이를 입력하세요: 200

//잘못된 나이입니다.

