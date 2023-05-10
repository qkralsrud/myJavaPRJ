class Car2 {
    private String color; //나만 쓰는 함수 자바클래스에서 조회 불가 private
    private int speed;

    Car2(String color,int speed){
        this.color =color;
        this.speed = speed;
    }

    public String getColor() { //public 함수로 private 함수를 가져온거
        return color;
    }

    public int getSpeed() {
        return speed;
    }
}
public class Ex11_7 {
    public static void main(String[] args) {
        Car2 myCar1 = new Car2("빨강",0);
        Car2 myCar2 = new Car2("파랑",30);

        System.out.println("자동차 1의 색상은 "+myCar1.getColor() +"이며, 현재속도는"
                + myCar1.getSpeed() + "km 입니다.");
        System.out.println("자동차 2의 색상은 "+myCar2.getColor() +"이며, 현재속도는"
                + myCar2.getSpeed() + "km 입니다.");
    }
}
