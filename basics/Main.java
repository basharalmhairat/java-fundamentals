package com.company;
import java.util.Calendar;
import java.lang.Math;
public class Main {
//    private static boolean time;

    static String flipNHeads(int n) {

        double result = Math.random();
        if (result < .5) {
            return "tails";
        } else {
            return "heads";
        }
    }

    static String Bluralize(String Animal, int nt) {

        if (nt == 1) {
            return Animal;
        } else {
            return Animal + 's';
        }

    }

    static String Clock() {

        while (true){
            Calendar x = Calendar.getInstance();
        String h = Integer.toString(x.get(Calendar.HOUR_OF_DAY));
        String m = Integer.toString(x.get(Calendar.MINUTE));
        String s = Integer.toString(x.get(Calendar.SECOND));
        String time = h + ":" + m + ":" + s;
        System.out.println(time);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }

    }

}


        public static void main(String[] args) {
            int DogCount = 1;
            System.out.println("I own " + DogCount + " " + Bluralize("dog", DogCount) + ".");
            int catCount = 2;
            System.out.println("I own " + catCount + " " + Bluralize("cat", catCount) + ".");
            int turtleCount = 0;
            System.out.println("I own " + turtleCount + " " + Bluralize("turtle", turtleCount) + ".");


            int flipTail = 0;
            int flipped = 0;
            int flip = 0;

            while (flipNHeads(1).equals("tails")) {
                flipTail++;
                System.out.println("tails");
            }

            while (flipNHeads(1).equals("heads")) {
                flipped++;
                System.out.println("heads");
            }
            flip = flipTail + flipped;
            System.out.println("It took" + " " + flip + " " + "flips to flip" + " " + flipped + " " + "head in a row.");

            System.out.println(Clock());


        }

    }






