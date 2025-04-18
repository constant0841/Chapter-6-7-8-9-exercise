//사용자로부터 비밀번호를 입력받는다.
//비밀번호가 다음 조건을 만족하지 않으면 사용자 정의 예외를 발생시킨다:
//- 길이는 8자 이상
//- 첫 글자는 반드시 대문자
//조건을 만족하지 않으면 "비밀번호 조건을 만족하지 않습니다." 출력
//조건을 만족하면 "비밀번호가 설정되었습니다." 출력
//class InvalidPasswordException
//
//import java.util.*;
//
//class InvalidPasswordException extends Exception {
//    public InvalidPasswordException (String message){
//        super("비밀번호 조건을 만족하지 않습니다.");
//    }
//}
//
//public class Chapter8_ex11{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("비밀번호를 입력하세요:");
//        try{
//            String password = sc.nextLine();
//            if (password.length() < 8 || !Character.isUpperCase(password.charAt(0))){
//                throw new InvalidPasswordException(password);
//            }
//            System.out.println("비밀번호가 설정되었습니다.");
//        }catch(InvalidPasswordException e){
//            System.out.println(e.getMessage());
//        }
//    }
//}
//비밀번호를 입력하세요: test1234
//        비밀번호 조건을 만족하지 않습니다.
//        비밀번호를 입력하세요: Test1234
//        비밀번호가 설정되었습니다.
