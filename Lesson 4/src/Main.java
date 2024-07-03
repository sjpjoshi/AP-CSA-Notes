import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------
        // the math class
        // + - / * % -built in ones
        // the others we can access without a direct call the java math class
        // examples are sin, cos, log, exponent, ln, sqrt

        // exponent/power
        double value = 2;
        double valuePowered = Math.pow(value, 2); // the number being powered, the power of
        // 2^2 = 4
        System.out.println(valuePowered);

        // a^2 + b^2 = c^2
        double a = Math.pow(3.0,2);
        double b = Math.pow(4.0,2);
        double c = a + b;
        //System.out.println(c);

        // sqrt
        double d = Math.cbrt(4);
        System.out.println(d);

        // sin, cos, tan, sin^-1, cos^-1, tan^-1
        double num = Math.sin(Math.toDegrees(30));
        System.out.println(num);
        double num2 = Math.asin(Math.toRadians(10));
        System.out.println(num2);
        double num3 = Math.cos(Math.toRadians(10));
        System.out.println(num3);
        double num4 = Math.tan(Math.toRadians(10));
        System.out.println(num4);
        System.out.println(0.0000001/0.1);

        // log() base 2
        // log10() base 10
        // log1p() is natural log
        double num5 = Math.log10(1);
        System.out.println(num5);

        // the exact functions will give a full number
        int a2 = Math.addExact(1,1);
        // not a necessary function but if you need it
        System.out.println(a2);

        // Random
        Random rand = new Random(); // it took it from C
        int move = rand.nextInt();
        // randInt(#) 0-#
        // randInt(#1,#2) #1 - (#2 - 1)
        // 3,6 ->3-5
        // randInt() any random number
        System.out.println(move);

        //--------------------------------------------------

        //--------------------------------------------------
        // The object class
        // this allows to compare classes
        // getClass() and toString()

        TesterClass testerClass = new TesterClass("suraj", 20);
        System.out.println(testerClass.toString());

        // getClass()
        // returns the runtime class of the object
        System.out.println(testerClass.getClass().getName());
        //--------------------------------------------------

        // The wrapper class
        //  translate variable values
        // it takes the normal variable and converts it into its class origin
        // The String variable is already a class so it does not have a wrapper
        // Integer: class
        // int: variable
        int b2 = 100;
        Integer test = Integer.valueOf(b2);
        System.out.println(test);

        double c2 = 55.55;
        Double test2 = Double.valueOf(c2);

        Integer someNumber = Integer.parseInt("100");
        System.out.println(someNumber);

        //--------------------------------------------------

    } // main

} // Main