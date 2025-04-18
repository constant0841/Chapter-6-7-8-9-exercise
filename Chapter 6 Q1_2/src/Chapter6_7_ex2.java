//Shape 배열에 Circle과 Rectangle을 넣고
//각각의 도형 이름과 넓이를 출력할 것.
//
//        💡 출력 예시 (예시 값으로 출력될 수 있는 형태)
//도형: 원, 넓이: 78.54

//도형: 사각형, 넓이: 20.0

public class Chapter6_7_ex2 {
    public static void main(String[] args){
        Shape[] shape = {new Circle(5), new Rectangle(4, 5.5)};
        System.out.println(shape[0].toString());
        System.out.println(shape[1].toString());
    }
}

abstract class Shape{

    String name;
    Shape() {
        this("name");
    }
    Shape(String name) {
        this.name = name;
    }

    abstract double calcArea();

    public String getName(String name) {
        return name;
    }
}

class Circle extends Shape{

    double radius;

    Circle(){
        super("원");
    }

    Circle(double radius){
        super("원");
        this.radius = radius;
    }

    double calcArea(){
        return ((double) Math.round(Math.PI * (radius * radius)*100)) / 100;
    }

    public String toString(){
        return "도형 : " + name + ", 넓이 : " + calcArea();
    }

}

class Rectangle extends Shape{
    double width, height;

    Rectangle(){
        super();
    }

    Rectangle(double width, double height){
        super("사각형");
        this.width = width;
        this.height = height;
    }

    Rectangle(int width, double height){
        super("사각형");
        this.width = width;
        this.height = height;
    }

    Rectangle(double width, int height){
        super("사각형");
        this.width = width;
        this.height = height;
    }

    double calcArea(){
        return (double)width * height;
    }

    public String toString(){
        return "이름 : " + super.name + ", 넓이 : " + calcArea();
    }
}

