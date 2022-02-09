package Lab1;

public class DiceGame {
    public static void main(String [] args)
    {
        Die firstDie = new Die();
        Die secondDie = new Die(3);
        Die thirdDie = new Die(10, "d4");

        // dice creation
        System.out.println("Creating a default "+firstDie.getType()+"...");
        System.out.println("Creating a "+secondDie.getType()+"...");
        System.out.println("Creating a "+thirdDie.getType()+"...");

        System.out.println("The current side up for "+firstDie.getType()+" is "+firstDie.getCurrentSide());
        System.out.println("The current side up for "+secondDie.getType()+" is "+secondDie.getCurrentSide());
        System.out.println("The current side up for "+thirdDie.getType()+" is "+thirdDie.getCurrentSide());
        System.out.println(" ");

        // testing roll method
        System.out.println("Rolling the "+firstDie.getType()+"...");
        firstDie.roll();
        System.out.println("The new value is "+firstDie.getCurrentSide());

        System.out.println("Rolling the "+secondDie.getType()+"...");
        secondDie.roll();
        System.out.println("The current side up for "+secondDie.getType()+" is "+secondDie.getCurrentSide());

        System.out.println("Rolling the "+thirdDie.getType()+"...");
        thirdDie.roll();
        System.out.println("The current side up for "+thirdDie.getType()+" is "+thirdDie.getCurrentSide());
        System.out.println(" ");

        // set a die to its highest value
        System.out.println("Setting the "+secondDie.getType()+" to show "+secondDie.getNumbOfSides());
        secondDie.toUpperLimit();
        System.out.println("The side up is now "+secondDie.getCurrentSide());
    }
}
