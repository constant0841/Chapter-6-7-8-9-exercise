//사용자에게 문자열을 입력받는다.
//입력된 문자열에서 영어 알파벳(대소문자)과 숫자만 남기고 나머지 문자(공백, 특수문자 등)는 모두 제거한다.
//필터링된 문자열을 출력한다.
//
//💡 출력 예시
//입력: Hello! Java123 @# World~
//출력: HelloJava123World
import java.util.*;

public class Chapter9_ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String str1 = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }

        System.out.println("출력: " + sb.toString());
    }
}
