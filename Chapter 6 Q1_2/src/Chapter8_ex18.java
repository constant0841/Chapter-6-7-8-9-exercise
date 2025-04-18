//공백 기준으로 단어들을 나눈다 (예: "I love Java programming" → 4개의 단어)
//단어 개수를 출력한다.
//각 단어를 한 줄씩 출력한다.

import java.util.StringTokenizer;

public class Chapter8_ex18 {
    public static void main(String[] args){
        String sb = "I love Java Programming";
        String[] words = sb.split(" ");
        StringTokenizer word = new StringTokenizer(sb);

        System.out.println("--- split() 사용 ---");
        System.out.println("단어 개수 : " + words.length);
        for (int i = 0 ; i < words.length ; i++){
            System.out.println(words[i]);
        }
        System.out.println("--- StringTokenizer 사용 ---");
        System.out.println("단어 개수 : " + word.countTokens());
        while (word.hasMoreTokens()) {
            System.out.println(word.nextToken());
        }

    }
}

//split()과 StringTokenizer 두 방법을 모두 사용해서 구현한다.
//        💡 예시 출력
//문장을 입력하세요: I love Java programming
//--- split() 사용 ---
//단어 개수: 4
//I
//love
//Java
//programming
//--- StringTokenizer 사용 ---
//단어 개수: 4
//I
//love
//Java

//programming
