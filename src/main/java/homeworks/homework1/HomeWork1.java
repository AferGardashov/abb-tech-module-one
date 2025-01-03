package homeworks.homework1;

public class HomeWork1 {

    public static void main(String[] args) {

//        1.
//        Declare an int variable and a double variable.
//        Assign the int value to the double variable.
//        Print both variables and observe implicit typecasting.
        int a = 6;
        double b = a;

        System.out.println(a);
        System.out.println(b);


//        2.
//        Declare a double variable and an int variable.
//        Assign the double value to the int variable using explicit typecasting.
//        Print both variables and observe explicit typecasting
        double d = 5.0;
        int i = (int) d;
        System.out.println(d);
        System.out.println(i);

    }
}
