package lucas.zoo.com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hyena extends lucas.zoo.com.Animal {
    // Create a static int that keeps track of the number of animals created.
    static int numOfHyenas = 0;

    // Create a constructor.
    public Hyena() {
        super();
        numOfHyenas++;
    }
}
