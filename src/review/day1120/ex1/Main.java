package review.day1120.ex1;

public class Main {

    public static void main(String[] args) {
        Warrior aWarrior = new Warrior();
        aWarrior.attack("브라이언", "칼");
        aWarrior.reAttack();
        aWarrior.attack("필립", "창");
        aWarrior.attack("마크", "지팡이");
        aWarrior.reAttack();
        aWarrior.reAttack();

    }
}
