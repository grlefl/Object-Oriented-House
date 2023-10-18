/**
 * Represents an individual with a name and associated house.
 * Person's house is represented by House object.
 * @see House
 */
public class Person {

    /**
     * The name of this person.
     */
    private String name;

    /**
     * The house associated with this person.
     */
    private final House house;



    /**
     * Creates a new person with the specified name and associated house.
     * @param name The name of this person.
     * @param house The house where this person lives.
     */
    public Person(String name,House house){
        this.house = house;
        this.name = name;
    }



    /**
     * Sets the name of this person.
     * @param name The new name of this person.
     */
    public void setName(String name) {
        this.name = name;
    }



    /**
     * Retrieves the name of this person.
     * @return The name of this person.
     */
    public String getName() {
        return name;
    }



    /**
     * Returns a string representation of this person, including their name and house details.
     * @return A string containing this person's name, and house and door details.
     */
    @Override
    public String toString(){
        return "name: " + name + "\n" + house.toString() + "\n" + house.getDoor().toString();
    }
}
