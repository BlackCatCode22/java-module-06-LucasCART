package lucas.zoo.com;

public class Lion extends lucas.zoo.com.Animal {
    // Create a static int that keep track of the number of lions created.
    static int numOfLions = 0;

    // Create a constructor.
    public Lion(){
        super();
        numOfLions++;
    }

    public Lion(String sex, int age, int weight, String animalName, String animalID, String animalBirthDate, String animalColor, String animalOrigin){
        super(sex, age, weight, animalName, animalID, animalBirthDate, animalColor, animalOrigin);
        numOfLions++;
    }

}