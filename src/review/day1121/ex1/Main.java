package review.day1121.ex1;

public class Main {

    public static void main(String[] args) {

        Warrior a = new Warrior();
        a.name = "카나";
        a.age = 122;
        a.aWeapon = new Knife();
        a.attack();

        a.name = "초코";
        a.age = 123;
        a.aWeapon = new Bow();
        a.attack();

    }

}
