/**
 * Represents a house.
 * The house has an area and a door.
 * @see Door
 */
public class House {

    /**
     * The square footage of this house.
     */
    private int area;

    /**
     * The door of this house.
     */
    private final Door door;



    /**
     * Creates a new House object with a default area of 1500 square feet.
     * Initializes Door object with default settings.
     */
    public House() {
        this(1500); // default area
    }

    /**
     * Creates a new House object with custom area.
     * Sets the area of House object to specified value.
     * Initializes Door object with default settings.
     * @param area The desired area of the house in square feet. Must be non-negative.
     */
    public House(int area) {
        setArea(area);
        this.door = new Door();
    }



    /**
     * Sets area of the house to the specified value.
     * @param area The desired area of the house in square feet. Must be non-negative.
     * @throws IllegalArgumentException If the provided area is negative.
     */
    public void setArea(int area) {
        if (area >= 0){ // corner cases?
            this.area = area;
        } else {
            throw new IllegalArgumentException("area must be non-negative");
        }
    }

    /**
     * Sets color of the door to the specified value.
     * @param color The desired color of the door.
     */
    public void setDoor(String color) {
        door.setColor(color);
    }



    /**
     * Retrieves the area of the house in square feet.
     * @return The area of the house.
     */
    public int getArea() {
        return area;
    }

    /**
     * Retrieves the door of the house.
     * @return The Door object associated with the house.
     */
    public Door getDoor() {
        return door;
    }



    /**
     * Returns a string representation of the house, including its area.
     * @return A string in the format: "I am a house, my area is [area] square feet."
     */
    @Override
    public String toString() {
        return "I am a house, my area is "+ getArea() + " square feet.";
    }
}
