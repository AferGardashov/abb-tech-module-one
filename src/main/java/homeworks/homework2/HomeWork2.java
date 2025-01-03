package homeworks.homework2;

import java.util.Scanner;

public class HomeWork2 {

    Scanner scanner = new Scanner(System.in);

    //1. 0-dan verilmish edede qeder butun 2-ye bolune bilen ededleri chap et.
    public void dividedByTwo(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
    }


    //2. 0-dan verilmish edede qeder sade ededleri chap et.
    public void primeNumbers(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    //used in primeNumbers method.
    private boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


    //3. Verilmish ededin butun reqemleri cemini tap.
    public int sumOfDigits(int n) {

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }


    //4. 3-cu deyishenden istifade etmeden 2 deyishenin yerini deyishmek.
    public void swapIntegers(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }


    //5. Ededin reqemlerinin sayini tapin.
    public int numberOfDigits(int n) {
        int number = 0;
        while (n > 0) {
            number += 1;
            n /= 10;
        }
        return number;
    }


    //6. "İstifadəçidən ay nömrəsini daxil etməyi təklif edən proqram yazın.
    // Sonra daxil edilmiş ay nömrəsinə əsasən həmin ayın adını çap edən keçid-case strukturundan istifadə edərək proqramı tamamlayın.
    // Məsələn, istifadəçi 1-i daxil edərsə, proqram bunu etməlidir. 'Yanvar' yaz, istifadəçi 2 daxil edərsə, 'Fevral' yazmalıdır; və s."
    public void printMonths() {
        System.out.println("Enter a number to see month: \nEnter 0 to exit: ");
        while (true) {
            int n = scanner.nextInt();
            switch (n) {
                case 0:
                    return;
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.err.println("INVALID INPUT. There are only 12 months bro.");
            }
        }

    }

    //7.  Üçbucağın tərəflərinin düzgünlüyünü yoxlayan daha sonra isə sahəsini və perimetrini hesablayan alqoritm yazın.(a+b>c =>  bütün tərəflər üçün)
    public void triangleAlgorithm(int a, int b, int c) {
        if (isTriangleValid(a, b, c)) {
            System.out.println("Perimeter : " + perimeterOfTriangle(a, b, c) + "\nArea : " + areaOfTriangle(a, b, c));
        } else {
            System.out.println("Triangle is not valid");
        }
    }

    //used in triangleAlgorithm method.
    private boolean isTriangleValid(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
    //used in triangleAlgorithm method.
    private int perimeterOfTriangle(int a, int b, int c) {
        return a + b + c;
    }
    //used in triangleAlgorithm method.
    private double areaOfTriangle(int a, int b, int c) {
        double p = (a + b + c) / 2.0;
        double s = p * (p - a) * (p - b) * (p - c);
        double area = Math.pow(s, 0.5);

        return area;
    }


    //8. Calculator hazirlayın hər bir rəqəm və əmirlər(+,-,*,/,%) scannerlə daxil edilsin
    public void calculator() {


        while (true) {
            System.out.println("CALCULATOR APP");
            System.out.print("Enter a: ");
            int a = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter b: ");
            int b = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter operation(+,-,*,/,%) : ");
            String c = scanner.nextLine();
            switch (c) {
                case "0":
                    return;
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                case "%":
                    System.out.println(a % b);
                    break;
                default:
                    System.err.println("Invalid operator");
            }
        }


    }

    //9. Ədədin faktorialını hesablayın.
    public int factorial(int n) {
        if (n == 1) return n;
        return n * factorial(n - 1);
    }

}
