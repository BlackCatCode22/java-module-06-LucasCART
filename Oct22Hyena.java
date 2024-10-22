package lucas.zoo.com;

public class Hyena extends lucas.zoo.com.Animal {
    // Create a static int that keeps track of the number of animals created.
    static int numOfHyenas = 0;

    // Create a constructor.
    public Hyena() {
        super();
        numOfHyenas++;
    }
}
