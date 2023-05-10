class Car { //클래스
    public String color;
    public int speed;

    void upSpeed(int value){
        this.speed = this.speed + value;
    }

    void downSpeed(int value){
        this.speed = this.speed - value;
    }
}
public class Ex11_1 {
    public static void main(String[] args) {
        Car myCar1 = new Car(); //메모리에 올리는 인스턴스 (객체)
        myCar1.color ="빨강";
        myCar1.speed = 0;

        Car myCar2 = new Car();
        myCar2.color ="파랑";
        myCar2.speed = 0;

        Car myCar3 = new Car();
        myCar3.color ="노랑";
        myCar3.speed = 0;

        myCar1.upSpeed(30);
        System.out.println("자동차 1의 색상은 "+myCar1.color +"이며, 현재속도는"
        + myCar1.speed + "km 입니다.");

        myCar2.upSpeed(60);
        System.out.println("자동차 2의 색상은 "+myCar2.color +"이며, 현재속도는"
                + myCar2.speed + "km 입니다.");

        myCar3.upSpeed(0);
        System.out.println("자동차 3의 색상은 "+myCar3.color +"이며, 현재속도는"
                + myCar3.speed + "km 입니다.");
    }
}
