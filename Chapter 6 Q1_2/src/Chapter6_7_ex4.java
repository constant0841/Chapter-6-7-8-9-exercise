//인터페이스 Pet을 만든다.
//추상 메서드 void play() 선언
//
//        클래스 Dog, Cat, Robot을 작성한다.
//        Dog, Cat은 Pet을 구현하고
//play()에서 "강아지가 공놀이를 합니다.", "고양이가 실뭉치를 굴립니다." 출력
//
//Robot은 Pet을 구현하지 않는다
//
//main 메서드에서 Object 타입 배열에
//Dog, Cat, Robot 객체를 섞어서 저장한다.
//
//반복문을 통해 배열을 순회하면서
//Pet을 구현한 객체만 play()를 호출하도록 한다.
//        (→ instanceof 사용해서 Pet 여부 확인)
//
//        💡 출력 예시
//강아지가 공놀이를 합니다.
//고양이가 실뭉치를 굴립니다.
//

import java.util.Objects;

interface Pet{
    void play();
}

class Dog implements Pet{
    public void play(){
        System.out.println("강아지가 공놀이를 합니다.");
    }
}

class Cat implements Pet{
    public void play(){
        System.out.println("고양이가 실뭉치를 굴립니다.");
    }
}

class Robot{
    public void play(){
        System.out.println("로봇이 뛰어다닙니다.");
    }
}
public class Chapter6_7_ex4 {
    public static void main(String[] args){
        Object[] pet = {new Robot(), new Cat(), new Dog()};

        for(int i = 0 ; i < pet.length ; i++){
            if(pet[i] instanceof Pet){
                 ((Pet) pet[i]).play();
            }
        }
    }
}