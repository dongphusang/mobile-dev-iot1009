/**
 * Name: Sang Dong
 * A00223628
 * This program closely replicates dice
 */


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
     * A user can change the number of sides without affecting the type. A type is just the name of a die, moreover
     * there is no string manipulation on a die's type. A die can have 20 sides while named as "d100"
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

    // setters and getters of currentSide
    public int getCurrentSide(){
        return this.currentSide;
    }

    // generates a random value for the die
    public void roll()
    {
        this.currentSide = (int)(Math.random() * this.numbOfSides+1);
    }

    // set current side up to highest
    public void toUpperLimit()
    {
        this.currentSide = this.numbOfSides;
    }

    // prints content of a die
    @Override
    public String toString()
    {
        return String.format("Die%s  %s  %s", this.type, this.numbOfSides, this.currentSide);
    }





}