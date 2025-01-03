package homeworks.homework3;

import java.util.*;

public class HomeWork3 {

    //1. Write a Java program to get the index of all the characters of the alphabet
    public void charactersInAlphabet() {
        int i = 1;
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println("char: " + c + ", index: " + i);
            i++;
        }
    }

    //    2. Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.
//    Sample string: "The quick brown fox jumps over the lazy dog."
//    In the above string replace all the fox with cat.
//    Sample Output:
//    Original string: The quick brown fox jumps over the lazy dog.
//    New String: The quick brown cat jumps over the lazy dog.
    public String replaceSubstring(String text, String expression, String replacement) {

        String[] arr = text.split(" ");
        String newStr = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(expression))
                arr[i] = replacement;
            newStr += arr[i] + " ";
        }

        return newStr;
    }


    //    3. Write a Java program to find the second most frequent character in a given string.
//    Sample Output:
//    The given string is: successes
//    The second most frequent char in the string is: c
    public List<Character> mostFrequentChars(String text) {

        Map<Character, Integer> map = new HashMap<>();
        int n = 1;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, n);
            }
        }
        //asked chatGPT to sort.
        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values, Collections.reverseOrder());
        int value = values.get(1);

        List<Character> chars = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == value) {
                chars.add(entry.getKey());
            }
        }

        return chars;
    }


    //    4. Write a Java program to print the result of removing duplicates from a given string.
//    Sample Output:
//    The given string is: w3resource
//    After removing duplicates characters the new string is: w3resouc
    public void removeDuplicates(String text) {

        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < text.length(); i++) {
            set.add(text.charAt(i));
        }
        for (int i = 0; i < set.size(); i++) {
            System.out.print(set.toArray()[i]);
        }

    }


    //    5. Write a Java program to divide a string into n equal parts.
//    Sample Output:
//    The given string is: abcdefghijklmnopqrstuvwxy
//    The string divided into 5 parts and they are:
//    abcde
//    fghij
//    klmno
//    pqrst
//    uvwxy
    public List<String> divideString(String text, int parts) {

        int partLength = text.length() % parts == 0 ? text.length() / parts : (text.length() / parts) + 1;
        int add = partLength;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < text.length(); i += add) {
            int end = Math.min(partLength, text.length());
            list.add(text.substring(i, end));
            partLength += add;
        }
        return list;
    }


    //    6. Write a Java program to reverse words in a given string.
//    Sample Output:
//    The given string is: Reverse words in a given string
//    The new string after reversed the words: string given a in words Reverse
    public String reverseString(String text) {

        String[] arr = text.split(" ");
        String reversed = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            reversed += arr[i] + " ";
        }
        return reversed;
    }


    //    7. Write a Java program to return the sum of the digits present in the given string. In the absence of digits, the sum is 0.
//    Sample Output:
//    The given string is: ab5c2d4ef12s
//    The sum of the digits in the string is: 14
    public int sumOfDigitsInString(String text) {   // ab2cg34k

        int sum = 0;
        String digits = "123456789";
        for (int i = 0; i < text.length(); i++) {
            if (digits.contains(String.valueOf(text.charAt(i))))
                sum += text.charAt(i) - '0';
//                sum += Integer.parseInt(String.valueOf(text.charAt(i)));
        }

        return sum;
    }

    //    8. Write a Java program to sort in ascending and descending order by the length of the given array of strings.
//    Sample Output:
//    Original unsorted colors: [Green, White, Black, Pink, Orange, Blue, Champagne, Indigo, Ivory]
//    Sorted color (descending order): [Champagne, Orange, Indigo, Green, White, Black, Ivory, Pink, Blue]
//    Sorted color (ascending order): [Pink, Blue, Green, White, Black, Ivory, Orange, Indigo, Champagne]
    public void orderStringArrayAscending(String[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int k = i + 1; k < arr.length; k++) {

                if (arr[i].length() > arr[k].length()) {
                    String cash = arr[i];
                    arr[i] = arr[k];
                    arr[k] = cash;
                }
            }
        }
    }

    public void orderStringArrayDescending(String[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int k = i + 1; k < arr.length; k++) {

                if (arr[i].length() < arr[k].length()) {
                    String cash = arr[i];
                    arr[i] = arr[k];
                    arr[k] = cash;
                }
            }
        }
    }


    //9. Write a Java program to find the maximum and minimum value of an array.
    public int maxValueOfArray(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    public int minValueOfArray(int[] arr) {
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }


    //10. Write a program to count the occurrences of a specific value in an array.
    public int occurrencesOfValue(String[] arr, String value) {
        int occurrences = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value))
                occurrences++;
        }
        return occurrences;
    }


}
