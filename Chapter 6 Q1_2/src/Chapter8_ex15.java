//사용자에게 정수를 입력받고,
//음수를 입력하면 IllegalArgumentException 발생
//이 예외를 다시 RuntimeException에 연결해서 던지기
//마지막에는 getCause()를 통해 원인 출력
import java.util.*;

class Exception {
    public void exception(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        try {
            int num = sc.nextInt();
            if(num < 0){
                throw new RuntimeException("잘못된 입력입니다.", new IllegalArgumentException("음수는 허용되지 않습니다."));
            }
        }catch (RuntimeException e){
            System.out.println("예외 발생 : " + e.getMessage());
            System.out.println("원인 예외 : "+ e.getCause());
        }
    }
}

public class Chapter8_ex15 {
    public static void main(String[] args){
        Exception e = new Exception();
        e.exception();
    }
}

//💡 예시 출력
//정수를 입력하세요: -3
//예외 발생: 잘못된 입력입니다.
//원인 예외: java.lang.IllegalArgumentException: 음수는 허용되지 않습니다.
