package review.day1120.ex1;

public class Warrior {

    String name;
    String wappon;

    void attack(String name, String wappon) {
        this.name = name;
        this.wappon = wappon;

        System.out.println(name + "(아)가 " + wappon + "(으)로 공격합니다.");
    }

    void reAttack() {
        attack(name, wappon);
    }
}
