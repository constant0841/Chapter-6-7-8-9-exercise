//사용자로부터 문자열을 입력받아 다음 작업을 수행하시오.
//전체 문자열을 거꾸로 출력
//문자열의 길이를 출력
//공백을 -로 바꿔서 출력
//첫 글자와 마지막 글자 출력
//"Java"라는 단어가 포함되어 있는지 확인

//💡 출력 예시
//문자열을 입력하세요: Hello Java World
//뒤집은 문자열: dlroW avaJ olleH
//문자열 길이: 16
//공백을 '-'로 변경: Hello-Java-World
//첫 글자: H
//마지막 글자: d
//5. "Java" 포함 여부: true

import java.util.*;

public class Chapter9_ex17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        StringBuffer sb = new StringBuffer(sc.nextLine());
        StringBuffer sb1 = new StringBuffer(sb);
        String sb2 = new String(sb);
        StringBuffer sb3 = new StringBuffer(sb);
        String sb4 = new String(sb);
        System.out.println(sb.reverse());
        System.out.println(sb1.length());
        System.out.println(sb2.replace(" ", "-"));
        System.out.println("첫 글자 : " + sb3.charAt(0) + "\n마지막 글자 : " + sb3.charAt(sb3.length() - 1));
        System.out.println("\"Java\" 포함 여부 : " + sb4.contains("Java"));
    }
}
