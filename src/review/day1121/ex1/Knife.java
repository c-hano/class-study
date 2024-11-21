package review.day1121.ex1;

public class Knife extends Weapon {

    @Override
    void working(String name, int age) {
        System.out.println(age + "살 전사 " + name + "(이)가 칼(으)로 공격합니다.");
    }
}
