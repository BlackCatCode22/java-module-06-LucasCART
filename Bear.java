package lucas.zoo.com;

public class Bear extends lucas.zoo.com.Animal {
    static int numOfBears = 0;

    // Create a constructor.
    public Bear() {
        numOfBears++;
    }

    public Bear(String sex, int age, int weight, String animalName, String animalID, String animalBirthDate, String animalColor, String animalOrigin){
        super(sex, age, weight, animalName, animalID, animalBirthDate, animalColor, animalOrigin);
        numOfBears++;
    }

}