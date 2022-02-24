package com.company;
import java.util.Calendar;
import java.lang.Math;
public class Main {
    static String  flipNHeads(int n) {

        double result = Math.random();
        if (result < .5){
            return "tails" ;
        }
        else{
            return "heads";
        }
    }
        static String  Bluralize(String Animalnam, int nt) {

            if (nt == 1){
                return Animalnam;
            }
            else{
                return Animalnam+'s';
            }
        }
        public static void main(String[] args) {
            int DogCount = 1;
            System.out.println("I own " + DogCount + " " + Bluralize("dog", DogCount) + ".");
            int catCount = 2;
            System.out.println("I own " + catCount + " " + Bluralize("cat", catCount) + ".");
            int turtleCount = 0;
            System.out.println("I own " + turtleCount + " " + Bluralize("turtle", turtleCount) + ".");


            int fliptail = 0;
            int fliphead = 0;
            int flip = 0;

            while (flipNHeads(1) == "tails") {
                fliptail++;
                System.out.println("tails");
            }

            while (flipNHeads(1) == "heads") {
                fliphead++;
                System.out.println("heads");
            }
            flip = fliptail + fliphead;
            System.out.println("It took" + " " + flip + " " + "flips to flip" + " " + fliphead + " " + "head in a row.");


            while (true) {
                Calendar x = Calendar.getInstance();
                String s = Integer.toString(x.get(Calendar.SECOND));
                String m = Integer.toString(x.get(Calendar.MINUTE));
                String h = Integer.toString(x.get(Calendar.HOUR_OF_DAY));
                String time = h + ":" + m + ":" + s;
                System.out.println(time);
                try {Thread.sleep(1000);} 
                catch (InterruptedException r) { }
            }

        }

    }






