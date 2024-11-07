package lucas.zoo.com;

public class Tiger extends lucas.zoo.com.Animal {
    static int numOfTigers = 0;

    // Create a constructor.
    public Tiger() {
        numOfTigers++;
    }

    public Tiger(String sex, int age, int weight, String animalName, String animalID, String animalBirthDate, String animalColor, String animalOrigin){
        super(sex, age, weight, animalName, animalID, animalBirthDate, animalColor, animalOrigin);
        numOfTigers++;
    }

}
