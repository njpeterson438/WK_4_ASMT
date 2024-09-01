package week_4_asmt;

public class week_4_asmt {

	    public static void main(String[] args) {
	        // Task 1: Array of ages
	        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	        
	        // Task 1a: Subtract first element from last element
	        int result = ages[ages.length - 1] - ages[0];
	        System.out.println("1a. Result: " + result);

	        // Task 1b: Create new array ages2 with 9 elements
	        int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 15};
	        
	        // Task 1bii: Repeat subtraction for ages2
	        int result2 = ages2[ages2.length - 1] - ages2[0];
	        System.out.println("1bii. Result: " + result2);
	        
	        // Task 1c: Calculate average age
	        double averageAge = 0;
	        for (int age : ages2) {
	            averageAge += age;
	        }
	        averageAge /= ages2.length;
	        System.out.println("1c. Average age: " + averageAge);

	        // Task 2: Array of names
	        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	        
	        // Task 2a: Calculate average number of letters per name
	        int totalLetters = 0;
	        for (String name : names) {
	            totalLetters += name.length();
	        }
	        double averageLetters = (double) totalLetters / names.length;
	        System.out.println("2a. Average number of letters per name: " + averageLetters);
	        
	        // Task 2b: Concatenate all names with spaces
	        String allNames = String.join(" ", names);
	        System.out.println("2b. All names concatenated: " + allNames);

	        // Task 3: How to access the last element of an array
	        System.out.println("3. Last element of ages2: " + ages2[ages2.length - 1]);

	        // Task 4: How to access the first element of an array
	        System.out.println("4. First element of ages2: " + ages2[0]);

	        // Task 5: Create an array of int called nameLengths
	        int[] nameLengths = new int[names.length];
	        for (int i = 0; i < names.length; i++) {
	            nameLengths[i] = names[i].length();
	        }
	        
	        // Task 6: Sum all elements in nameLengths array
	        int sumOfNameLengths = 0;
	        for (int length : nameLengths) {
	            sumOfNameLengths += length;
	        }
	        System.out.println("6. Sum of all elements in nameLengths: " + sumOfNameLengths);

	        // Task 7: Method to concatenate word n times
	        System.out.println("7. Repeated word: " + repeatWord("Hello", 3));

	        // Task 8: Method to create full name
	        System.out.println("8. Full name: " + createFullName("John", "Doe"));

	        // Task 9: Method to check if sum of array > 100
	        int[] numbers = {10, 20, 30, 40, 5};
	        System.out.println("9. Sum greater than 100: " + isSumGreaterThan100(numbers));

	        // Task 10: Method to return average of array
	        double[] doubles = {10.5, 20.5, 30.0, 40.0};
	        System.out.println("10. Average of doubles: " + calculateAverage(doubles));

	        // Task 11: Method to compare averages of two arrays
	        double[] doubles2 = {5.0, 15.5, 25.0};
	        System.out.println("11. First array average greater: " + isAverageGreater(doubles, doubles2));

	        // Task 12: Method to check if will buy drink
	        System.out.println("12. Will buy drink: " + willBuyDrink(true, 11.00));

	        // Task 13: Custom method example
	        System.out.println("13. Random number in range: " + getRandomNumberInRange(1, 100));
	    }

	    // Task 7
	    public static String repeatWord(String word, int n) {
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < n; i++) {
	            result.append(word);
	        }
	        return result.toString();
	    }

	    // Task 8
	    public static String createFullName(String firstName, String lastName) {
	        return firstName + " " + lastName;
	    }

	    // Task 9
	    public static boolean isSumGreaterThan100(int[] numbers) {
	        int sum = 0;
	        for (int number : numbers) {
	            sum += number;
	        }
	        return sum > 100;
	    }

	    // Task 10
	    public static double calculateAverage(double[] numbers) {
	        double sum = 0;
	        for (double number : numbers) {
	            sum += number;
	        }
	        return sum / numbers.length;
	    }

	    // Task 11
	    public static boolean isAverageGreater(double[] array1, double[] array2) {
	        return calculateAverage(array1) > calculateAverage(array2);
	    }

	    // Task 12
	    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	        return isHotOutside && moneyInPocket > 10.50;
	    }

	    // Task 13
	    // This method returns a random number within a specified range.
	    // I created it because sometimes you need to generate random values in a game or simulation.
	    public static int getRandomNumberInRange(int min, int max) {
	        return (int) (Math.random() * (max - min + 1)) + min;
	    }
}
