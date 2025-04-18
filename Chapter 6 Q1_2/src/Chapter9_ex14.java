//문자열을 입력하세요: hello
//뒤집기: olleh
//"!!!" 추가: hello!!!
//첫 글자 삭제: ello
//3번째에 ★ 삽입: he★llo

import java.util.Scanner;

class StringMessage{
    public void message(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요");
        StringBuffer nb = new StringBuffer((sc.nextLine()));
        StringBuffer nb1 = new StringBuffer(nb);
        StringBuffer nb2 = new StringBuffer(nb);
        StringBuffer nb3 = new StringBuffer(nb);
        StringBuffer nb4 = new StringBuffer(nb);
        System.out.println("뒤집기 : " + nb1.reverse());
        System.out.println(" \"!!!\" 추가 : " + nb2.append("!!!"));
        System.out.println("첫 글자 삭제 : " + nb3.deleteCharAt(0));
        System.out.println("3번째에 ★ 삽입 : " + nb4.insert(2, "★"));

    }
}

public class Chapter9_ex14 {
    public static void main(String[] args){
        StringMessage sm = new StringMessage();
        sm.message();
    }
}
