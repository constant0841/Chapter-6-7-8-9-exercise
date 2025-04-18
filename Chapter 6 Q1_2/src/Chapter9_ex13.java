//문자열 길이
//첫 번째 문자
//마지막 문자
//모든 문자 대문자로 변환
//문자열에 "java"가 포함되어 있는지 여부
import java.util.*;

class Message {
    public void message(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String word = sc.nextLine();
        int l = word.length();
        System.out.println("문자열 길이 : " + word.length());
        System.out.println("첫 글자 : " + word.charAt(0));
        System.out.println("마지막 글자 : " + word.charAt(l - 1));
        System.out.println("대문자 변환 : " + word.toUpperCase());
        System.out.println("java 포함 여부 : " + word.contains("java"));
    }
}
//💡 예시
//문자열 입력: hello java
//문자열 길이: 10
//첫 글자: h
//마지막 글자: a
//대문자 변환: HELLO JAVA
//"java" 포함 여부: true
public class Chapter9_ex13 {
    public static void main(String[] args){
        Message m = new Message();
        m.message();
    }
}
