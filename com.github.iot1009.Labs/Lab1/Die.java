package Lab1;

public class Die {

    // declaring fields
    private String type;
    private int numbOfSides;
    private int currentSide;

    public Die()
    {
        type = "d6";
        numbOfSides = 6;
        roll();
    }

    /**
     * A 1 argument constructor
     * 
     * @param numbOfSides
     */
    public Die(int numbOfSides)
    {
        this.numbOfSides = numbOfSides;
        type = String.format("d%s", numbOfSides);
        roll();
    }

    /**
     * A 2 argument constructor
     * 
     * @param numbOfSides
     * @param type
     */
    public Die(int numbOfSides, String type)
    {
        this.numbOfSides = numbOfSides;
        this.type = type;
        roll();
    }

    // setters and getters of type
    private void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }

    // setters and getters of numbOfSides
    private void setNumbOfSides(int numbOfSides){
        this.numbOfSides = numbOfSides;
    }
    public int getNumbOfSides(){
        return this.numbOfSides;
    }

    // generates a random value for the die
    private void roll()
    {
        this.currentSide = ((int)Math.random() * this.numbOfSides ) + 1;
    }

    // prints content of a die
    @Override
    public String toString()
    {
        return String.format("Die: %s  %s  %s", this.type, this.numbOfSides, this.currentSide);
    }


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