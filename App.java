// Lucas 10/3/24
// zooVersion01.java

package lucas.zoo.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {

        return animalBirthdate;

    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to my Zoo Program!");

        // Create the animal name lists.
        // Call Utilities to get the animal name lists
        String filePath = "animalNames.txt";  // Update with the correct file path
        AnimalNameListsWrapper animalLists = Utilities.createAnimalNameLists(filePath);

        // Access the hyena names list
        ArrayList<String> listOfHyenaNames = animalLists.getHyenaNameList();

        // Use a for-each loop to output each hyena name
        System.out.println("Hyena Names:");
        for (String hyenaName : listOfHyenaNames) {
            System.out.println(hyenaName);
        }

        // Similarly, you can do this for the other animal lists
        ArrayList<String> listOfLionNames = animalLists.getLionNameList();
        System.out.println("\nLion Names:");
        for (String lionName : listOfLionNames) {
            System.out.println(lionName);
        }

        ArrayList<String> listOfTigerNames = animalLists.getTigerNameList();
        System.out.println("\nTiger Names:");
        for (String tigerName : listOfTigerNames) {
            System.out.println(tigerName);
        }

        ArrayList<String> listOfBearNames = animalLists.getBearNameList();
        System.out.println("\nBear Names:");
        for (String bearName : listOfBearNames) {
            System.out.println(bearName);
        }

        BufferedReader reader = null;

        String aniSex;
        String aniSpecies;

        try {
            // Create a BufferedReader to read the file
            reader = new BufferedReader(new FileReader("arrivingAnimals.txt"));
            String line;

            // Read each line of the file until reaching the end
            while ((line = reader.readLine()) != null) {
                // Print each line to the console
                System.out.println(line);
                // Parse this line of text.
                String[] arrayOfStrPartsOnComma = line.split(", ");
                // output the array elements
                // this is a for : each loop - very handy when examining array elements.
                int elementNum = 0;
                for (String thePart : arrayOfStrPartsOnComma) {
                    System.out.println("Element " + elementNum + " of arrayOfStrPartsOnComma is: " + thePart);
                    elementNum++;
                }
                String aniColor;
                String aniWeight;
                String aniOrigin01;
                String aniOrigin02;
                String aniAge;

                aniColor = arrayOfStrPartsOnComma[2];
                aniWeight = arrayOfStrPartsOnComma[3];
                aniOrigin01 = arrayOfStrPartsOnComma[4];
                aniOrigin02 = arrayOfStrPartsOnComma[5];

                System.out.println();
                String[] arrayOfStrPartsOnSpace = arrayOfStrPartsOnComma[0].split(" ");
                elementNum = 0;
                for (String thePart : arrayOfStrPartsOnSpace) {
                    System.out.println("Element " + elementNum + " of arrayOfStrPartsOnSpace is: " + thePart);
                    elementNum++;
                }
                // Get animal's sex and species and age
                aniAge = arrayOfStrPartsOnSpace[0];
                // make this an int.
                int intAniAge = Integer.parseInt(aniAge);
                aniSex = arrayOfStrPartsOnSpace[3];
                aniSpecies = arrayOfStrPartsOnSpace[4];
                System.out.println("\nThe animal's sex is " + aniSex);
                System.out.println("\nThe species is " + aniSpecies);
                System.out.println("\nThe color is " + aniColor);
                System.out.println("\nThe weight is " + aniWeight);
                System.out.println("\nOrigin01 is " + aniOrigin01);
                System.out.println("\nOrigin02 is " + aniOrigin02);

                System.out.println();

                String[] arrayOfStrPartsOnSpace02 = arrayOfStrPartsOnComma[1].split(" ");
                elementNum = 0;
                for (String thePart : arrayOfStrPartsOnSpace02) {
                    System.out.println("Element " + elementNum + " of arrayOfStrPartsOnSpace02 is: " + thePart);
                    elementNum++;
                }
                System.out.println();

                String ageInYears = arrayOfStrPartsOnSpace[0];
                String animalBirthSeason = arrayOfStrPartsOnSpace02[2];
                System.out.println("The age in years of the animal is: " + ageInYears);
                System.out.println("The season of birth of the animal is: " + animalBirthSeason);

                // Create the right animal object for this arriving animal.
                if (aniSpecies.equals("hyena")) {
                    System.out.println("\nThe animal is a hyena!");
                    // Create a hyena object and attach to the hyena ArrayList.
                    Hyena hyena = new Hyena(aniSex, intAniAge, 99, "to be named",
                            "animalID", "animalBirthDate", "aniColor",
                            aniOrigin01 + aniOrigin02);
                System.out.println("The new hyena's color is :" + hyena.getAnimalColor());
                }

                // this is a unit test - we are testing the Animal constructor we just created
                Animal myNewAnimal = new Animal("male", 4, 70, "Zig", "Hy01", "2020-3-21", "brown spots", "from San Diego Zoo");

                // Prove it!
                System.out.println("\n this is the new animal!\n");
                System.out.println("\n ID is: " + myNewAnimal.getAnimalID() + " and... name is: " + myNewAnimal.getAnimalName() + "\n");

                System.out.println("animal birthdate is: " + Utilities.calcAnimalBirthDate(Integer.parseInt(ageInYears), animalBirthSeason));


            }
        } catch (IOException e) {
            // Handle exceptions, such as file not found or I/O errors
            e.printStackTrace();
        } finally {
            // Close the BufferedReader in the finally block to ensure it gets closed
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}