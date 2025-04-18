class Student{
    String name;
    int studentNo;
    String major;

    Student(){
        this("이름없음", 0, "전공없음");
    }

    Student(String name, int studentNo){
        this(name, studentNo, "전공없음" );
    }

    Student(String name, int studentNo, String major){ // 마지막 생성자에서는 this()를 사용하지 못하는 걸로 알고 있음.
        this.name = name;
        this.studentNo = studentNo;
        this.major = major;
    }

    public String toString(){
        return "이름 : " + name + ", 학번 : " + studentNo + ", 전공 : " + major;
    }

}


public class Chapter6_7_ex {
    public static void main(String[] args) {
        Student s = new Student("이상수", 191275, "전자통신공학");
        System.out.println(s.toString());
        
    }
}
