package review.day1121.ex1;

public class Bow extends Weapon {

    @Override
    void working(String name, int age) {
        System.out.println(age + "살 전사 " + name + "(이)가 활(으)로 공격합니다.");

    }
}
