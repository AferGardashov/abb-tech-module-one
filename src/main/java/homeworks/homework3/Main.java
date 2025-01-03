package homeworks.homework3;

public class Main {

    public static void main(String[] args) {

        HomeWork3 work = new HomeWork3();

        //1.
        work.charactersInAlphabet();
        System.out.println("------------------------------");

        //2.
        work.replaceSubstring("The quick brown fox jumps over the lazy dog.", "fox", "cat");
        System.out.println("------------------------------");

        //3.
        work.mostFrequentChars("successes");
        System.out.println("------------------------------");

        //4.
        work.removeDuplicates("w3resource");
        System.out.println("------------------------------");

        //5.
        work.divideString("abcdefghijklmnopqrstuvwxy", 5);
        System.out.println("------------------------------");

        //6.
        work.reverseString("Reverse words in a given string");
        System.out.println("------------------------------");

        //7.
        work.sumOfDigitsInString("ab5c2d4ef12s");
        System.out.println("------------------------------");

        //8.
        String[] arr = {"Green", "White", "Black", "Pink", "Orange", "Blue", "Pink", "Champagne", "Indigo", "Ivory"};
        work.orderStringArrayAscending(arr);
        work.orderStringArrayDescending(arr);
        System.out.println("------------------------------");

        //9.
        int[] intArray = {2,4,6,3,6,8,1,2,3,7};
        work.maxValueOfArray(intArray);
        work.minValueOfArray(intArray);
        System.out.println("------------------------------");

        //10.
        work.occurrencesOfValue(arr, "Pink");



    }
}
