//길이 3인 정수 배열 arr에 값을 입력받는다.
//사용자에게 인덱스를 입력받고, 해당 인덱스의 값을 출력한다.
//존재하지 않는 인덱스를 입력할 경우,
//"유효하지 않은 인덱스입니다." 라는 예외 메시지를 출력하시오.

//        💡 출력 예시
//정수 3개를 입력하세요:
//        10 20 30
//확인할 인덱스를 입력하세요: 5
//유효하지 않은 인덱스입니다.
import java.util.Scanner;
public class Chapter8_ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.print("정수 3개를 입력하세요 : ");
        for (int i = 0 ; i < arr.length ; i++){
            int num = sc.nextInt();
            arr[i] = num;
        }
        try {
            System.out.print("확인할 인덱스를 입력하세요 : ");
            int num = sc.nextInt();
            System.out.println(arr[num]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("유효하지 않은 인덱스입니다.");
        }
    }
}
