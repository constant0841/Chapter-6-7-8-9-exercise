//**NegativeNumberException**이라는 사용자 정의 예외 클래스를 만든다.
//음수 입력 시 발생하는 예외
//import java.util.*;
//
//class NegativeNumberException extends Exception{
//    public NegativeNumberException(int num){
//        super("음수는 입력할 수 없습니다.");
//    }
//}
////사용자에게 정수를 하나 입력받는다.
////음수를 입력하면 NegativeNumberException을 발생시켜라
////양수 또는 0이면 "입력한 수: X" 라고 출력
////예외는 try-catch로 받아서
////"음수는 입력할 수 없습니다." 를 출력하시오.
//public class Chapter8_ex10 {
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.print("정수를 입력하세요 : ");
//            int num = sc.nextInt();
//            if(num < 0) {
//                throw new NegativeNumberException(num);
//            }
//            System.out.println("입력한 수 : " + num);
//        }
//        catch (NegativeNumberException e){
//            System.out.println(e.getMessage());
//        }
//        catch (InputMismatchException e){
//            System.out.println("정수만 입력해주세요.");
//        }
//    }
//}
//
////        💡 출력 예시
////예외 발생:
////정수를 입력하세요: -5
////음수는 입력할 수 없습니다.
//
////정상 입력:
////정수를 입력하세요: 7
////입력한 수: 7
//
//
