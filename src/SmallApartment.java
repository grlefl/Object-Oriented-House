/**
 * Represents a type of residential dwelling that is derived from the House class.
 * Encapsulates properties such as the square footage of this small apartment and inherits features and behavior from House.
 * @see House
 */
public class SmallApartment extends House{

    /**
     * The square footage of this small apartment.
     */
    private int area;



    /**
     * Creates a new SmallApartment object with a default area of 500 square feet using House constructor.
     * Initializes Door object with default settings.
     */
    public SmallApartment() {
        super(500);
    }

    /**
     * Creates a new SmallApartment object with custom area using House constructor.
     * Sets the area of SmallApartment object to specified value.
     * Initializes Door object with default settings.
     * @param area The desired area of the house in square feet. Must be non-negative.
     */
    public SmallApartment(int area) {
        super(area);
    }
}
