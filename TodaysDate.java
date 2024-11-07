// Lucas 10/1/24
// TodaysDate.java
import java.util.Date;
import java.text.SimpleDateFormat;

public class TodaysDate {
    public static void main(String[] args) {

        System.out.println("\nWelcome to ");

        Date today = new Date();

        // Define the desired date format
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");

        // Format the date and store it in a string
        String strTodaysDate = formatter.format(today);
        String strTodaysYear = formatterYear.format(today);

        // Output the result
        System.out.println("Today's date in the new format yyyy-MM-dd: " + strTodaysDate);

        // Calculate birthdates for the following two hyenas
        // 1) 4 year old female hyena, born in spring, tan color, 70 pounds, from
        //Friguia Park, Tunisia
        // 2) 12 year old male hyena, born in fall, brown color, 150 pounds, from
        //Friguia Park, Tunisia

        // Write Java code to calculate birthdates for the animal and then create a method that returns a string
        // for the animal's birthdate.

        // input: "4 year old female hyena, born in spring"
        // processing: find the age and birth season and then use decision control structures to calculate the date.

        // Parse the string
        String strString = "4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia";
        // split the string on ", "
        System.out.println();
        String[] arrayOfStrPartsOnComma = strString.split(", ");
        // output the array elements
        // this is a for : each loop - very handy when examining array elements.
        int elementNum = 0;
        for (String thePart: arrayOfStrPartsOnComma) {
            System.out.println("Element " + elementNum + "of arrayOfStrPartsOnComma is: " + thePart);
            elementNum++;
        }
        System.out.println();
        String[] arrayOfStrPartsOnSpace = arrayOfStrPartsOnComma[0].split(" ");
        elementNum = 0;
        for (String thePart: arrayOfStrPartsOnSpace) {
            System.out.println("Element" + elementNum + "of the arrayOfStrPartsOnSpace is: " + thePart);
        }

        System.out.println();

        String[] arrayOfStrPartsOnSpace02 = arrayOfStrPartsOnComma[1].split(" ");
        elementNum = 0;
        for (String thePart: arrayOfStrPartsOnSpace02) {
            System.out.println("Element " elementNum + "of arrayOfStrPartsOnSpace02 is: " + thePart);
            elementNum++;
        }
        System.out.println();

        String ageInYears = arrayOfStrPartsOnSpace[0];
        String animalBirthSeason = arrayOfStrPartsOnSpace02[2];
        System.out.println("The age in years of the animal is: " + ageInYears);
        System.out.println("The season of birth of the animal is: " + animalBirthSeason);

        String animalBirthdate = "";
        int todaysYear = Integer.parseInt(strTodaysYear);
        int animalBirthYear = todaysYear - Integer.parseInt(ageInYears);

        if (animalBirthSeason.contains("spring")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-03-21";
        }
        if (animalBirthSeason.contains("fall")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-09-21";
        }
        if (animalBirthSeason.contains("winter")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-12-21";
        }
        if (animalBirthSeason.contains("summer")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-06-21";
        }

        System.out.println("\nanimalBirthdate = " + animalBirthdate);

    }
}