//사용자에게 아이디와 비밀번호를 입력받는다.
//아이디가 "admin"이 아니거나, 비밀번호가 "1234"가 아니면 각각 IllegalArgumentException, IllegalStateException 발생
//이 예외를 하나의 RuntimeException으로 감싸서 다시 던지기
//getCause()로 원인 예외를 출력한다.

import java.util.*;

public class Chapter8_ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("아이디 입력 : ");
            String id = sc.nextLine();
            System.out.print("비밀번호 입력 : ");
            String password = sc.nextLine();
            if(!id.equals("admin")){
                throw new RuntimeException("로그인 실패",new IllegalStateException("아이디가 일치하지 않습니다."));
            }
            else if (!password.equals("1234")){
                throw new RuntimeException("로그인 실패", new IllegalArgumentException("비밀번호가 일치하지 않습니다."));
            }
        }catch (RuntimeException e){
            System.out.println("예외 발생 : " + e.getMessage());
            System.out.println("원인 : "+ e + ": " + e.getCause());
        }
    }
}
//✅ 출력 예시 1
//아이디 입력: user
//비밀번호 입력: 1234
//예외 발생: 로그인 실패
//원인: java.lang.IllegalArgumentException: 아이디가 일치하지 않습니다.
//✅ 출력 예시 2
//아이디 입력: admin
//비밀번호 입력: 0000
//예외 발생: 로그인 실패
//원인: java.lang.IllegalStateException: 비밀번호가 일치하지 않습니다.
