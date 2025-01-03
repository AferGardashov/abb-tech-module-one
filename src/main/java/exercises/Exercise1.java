package exercises;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 ex = new Exercise1();

        System.out.println(Math.pow(2, -2147483648));
        System.out.println(ex.myPow(2, -2147483648));

    }


    public double myPow(double x, double n) {

        if (n == 0 || x == 1) {
            return 1;
        }
        double multiply = x;
        double loop = n < 0 ? -n : n;

        for (int i = 1; i < loop; i++) {
            x *= multiply;
        }
        if (n < 0) {
            return 1 / x;
        }

        return x;
    }

    public String extractSubstring(String text, int start, int end) {

//        String substring = text.substring(start,end);

        String substring = "";

        for (int i = start; i < end; i++) {
            substring += text.charAt(i);
        }

        return substring;
    }

    public String replaceCharacters(String text, char occurrence, char replacement) {

//        String text2 = text.replaceAll(String.valueOf(occurrence), String.valueOf(replacement));

        String text2 = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == occurrence)
                text2 += replacement;
            else text2 += text.charAt(i);
        }

        return text2;
    }


    public boolean checkStringContains(String text, String substring) {

//        text.contains(substring);

        int a = 0;
        int b = 0;

        while (a < text.length() && b < substring.length()) {
            if (text.charAt(a) == substring.charAt(b)) {
                b++;
                a++;
            } else {
                a++;
                b = 0;
            }

        }

        if (b == substring.length())
            return true;
        return false;
    }

    public void printString(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }


    public boolean checkEqualityOfStringByRef(String str1, String str2) {
        return str1 == str2;
    }


    public boolean checkEqualityOfStringByValue(String str1, String str2) {

//        str1.equals(str2);

        if (str1.length() != str2.length())
            return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i))
                return false;
        }

        return true;
    }


    public int calculateElements(int[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

}
