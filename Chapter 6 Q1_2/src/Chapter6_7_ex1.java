//**main()**에서 Employee 배열로 Manager, Engineer 객체를 넣고
//다형성으로 반복문을 통해 getInfo()를 호출할 것
public class Chapter6_7_ex1 {
    public static void main(String[] args){
        Employee[] employees = {
                new Manager("이상수", 300, 300),
                new Engineer("이상수", 300, "백엔드 개발자")};
        for (int i = 0 ; i < employees.length ; i++){
            System.out.println(employees[i].getInfo());
        }
    }
}
class Employee{
    String name;
    int salary;

    Employee(){
        this("이름없음", 0);
    }

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getInfo(){
        return "이름 : " + name + ", 급여 : " + salary;
    }

}
class Engineer extends Employee{
    String skill;

    Engineer(){
        super();
    }

    Engineer(String name, int salary, String skill){
        super(name,salary);
        this.skill = skill;
    }

    public String getInfo(){
        return "이름 : " + name + ", 급여 : " + salary + ", 기술 : " + skill;
    }

}

class Manager extends Employee{
    int bonus;

    Manager(){
        super();
    }

    Manager(String name, int salary, int bonus){
        super.name = name;
        super.salary = salary;
        this.bonus = bonus;
    }

    public String getInfo(){
        return "이름 : " + name + ", 급여 : " + salary + ", 보너스 : " + bonus;
    }

}
