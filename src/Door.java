/**
 * Represents a door with a specific color.
 * Instances of this class encapsulate the door's color.
 */
public class Door {

    /**
     * The color of this door.
     */
    private String color;



    /**
     * Creates a new Door object with the default color "brown".
     */
    public Door() {
        this("brown"); // default parameter
    }

    /**
     * Creates a new Door object with a custom color.
     * Sets color of Door object to specified value.
     * @param color The color of the door.
     */
    public Door(String color) {
        this.color = color;
    }



    /**
     * Retrieves the color of the door.
     * @return The color of the door.
     */
    public String getColor() {
        return color;
    }



    /**
     * Sets the color of the door.
     * @param color The desired color of the door.
     */
    public void setColor(String color) {
        this.color = color;
    }



    /**
     * Returns a string representation of the door, including its color.
     * @return A string in the format: "I am a [color] door."
     */
    @Override
    public String toString() {
        return "I am a " + getColor() + " door.";
    }
}
