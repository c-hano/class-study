package review.day1121.ex2;

public class Main {

    public static void main(String[] args) {
        Warrior a = new Warrior();
        a.name = "카니";
        a.age = 122;
        a.weapon = new Knife();
        a.attack();
        // 출력 : 22살 전사 카니(이)가 칼(으)로 공격합니다.

        a.name = "초코";
        a.age = 123;
        a.weapon = new Bow();
        a.attack();
        // 출력 : 22살 전사 초코(이)가 활(으)로 공격합니다.
    }
}

class Warrior {
    String name;
    int age;
    Weapon weapon;

    void attack() {
        weapon.work(name, age);
    }
}

abstract class Weapon {
    private String weaponName;

    public void work(String userName, int userAge) {
        System.out.println(userAge + "살 전사 " + userName + "(이)가 "+ getName() +"(으)로 공격합니다.");
    }

    abstract String getName();
}

class Knife extends Weapon {

   String weaponName = "칼";

    @Override
    public String getName() {
        return weaponName;
    }
}

class Bow extends Weapon {
    String weaponName = "활";

    @Override
    public String getName() {
        return weaponName;
    }
}

