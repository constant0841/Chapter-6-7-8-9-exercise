//문장 3개를 입력받는다.
//모든 문장을 하나의 문자열로 이어 붙인다. (StringBuilder 또는 StringBuffer 사용)
//전체 문장의 길이를 출력한다.
//"Java"라는 단어가 포함되어 있으면 "Java 포함" 출력, 아니면 "Java 없음" 출력
//전체 문장을 대문자로 변환해서 출력한다.
//UpperCase
import java.util.*;

public class Chapter9_ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문장 1 입력 : ");
        StringBuffer sb1 = new StringBuffer(sc.nextLine());
        System.out.print("문장 2 입력 : ");
        StringBuffer sb2 = new StringBuffer(sc.nextLine());
        System.out.print("문장 3 입력 : ");
        StringBuffer sb3 = new StringBuffer(sc.nextLine());

        StringBuffer sb = new StringBuffer();
        sb.append(sb1).append(" ").append(sb2).append(" ").append(sb3);
        String str = new String(sb);
        System.out.println("문장 길이 : " + sb.length());
        if (str.contains("Java")) {
            System.out.println("Java 포함");
        }
        System.out.println("전체 문장 (대문자) : " + str.toUpperCase());
    }
}

//💡 출력 예시
//문장 1 입력: Hello
//문장 2 입력: I love Java
//문장 3 입력: Let's code
//문장 길이: 33
//Java 포함

//전체 문장 (대문자): HELLO I LOVE JAVA LET'S CODE
