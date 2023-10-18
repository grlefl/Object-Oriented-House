/**
 * Demonstrates the hierarchy of house-related classes.
 * Includes tests for creating different types of houses and their associated objects, such as doors and residents.
 * Once a Person object is created, it can be assigned to a House object.
 * @see Person
 * @see House
 */

public class HouseClassHierarchy {
    /**
     * Entry point for the HouseClassHierarchy program.
     * @param args The command-line arguments (not used in this demonstration).
     */
    public static void main(String[] args) {

        // testing default apartment
        SmallApartment dumpster = new SmallApartment();
        Person raccoon = new Person("raccoon",dumpster);
        System.out.println(raccoon);

        System.out.println();

        // testing apartment with specific area
        SmallApartment toilet = new SmallApartment(2);
        Person rat = new Person("rat",toilet);
        System.out.println(rat);

        System.out.println();

        // testing if I can change door color
        House barbieHouse = new House();
        barbieHouse.setDoor("pink");
        Person barbieHerself = new Person("Barbie in the Flesh",barbieHouse);
        System.out.println(barbieHerself);

        System.out.println();

        // testing House and Door toString() methods
        System.out.println(barbieHouse);
        System.out.println(barbieHouse.getDoor());

        System.out.println();

        // polymorphism?
        House test = new SmallApartment();
        System.out.println(test);
    }
}