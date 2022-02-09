package Lab1;

public class DiceGame {
    public static void main(String [] args)
    {
        Die firstDie = new Die();
        Die secondDie = new Die(3);
        Die thirdDie = new Die(4, "d4");

        System.out.println(firstDie);
        System.out.println(secondDie);
        System.out.println(thirdDie);
    }
}
