package com.company;
import java.util.*;
public class Main {
    public static boolean containsDuplicates(Integer[] arr) {
        for (int j = 0; j < arr.length; j++)
            for (int k = j + 1; k < arr.length; k++)
                if (k != j && arr[k].equals(arr[j])) return true;
         return false;
    }
    public static int AVG(Integer[] arr) {
        int avg=0;
        for (int j = 0; j < arr.length; j++) {
            avg = arr[j]+avg;
        }
        return avg/ arr.length;
    }

    public static int[] Role(int num) {
        int result;
        int[] Dice = new int[num+1];
        for (int x = 1; x <= Dice.length-1; x++) {
     result = (1) + (int)(Math.random()* (6 - 1 + 1));
    Dice[x] = result;
        }
        return Dice;
    }

    public static String weeklyMonthTemperatures() {
        Set<Integer> Temp = new HashSet<>();
        int[][] Temperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}};
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 7; j++)
         Temp.add(Temperatures[i][j]);

        int High = Integer.MIN_VALUE;
        int Low = Integer.MAX_VALUE;
        for (int T : Temp) {
            if (T > High)
                High = T;
            if (T < Low)
                Low = T;
        }
        System.out.println("High: "+High);
        System.out.println("Low: "+Low);
        String x = "";
        for (int i = Low; i <High ; i++)
            if (!Temp.contains(i)) {
                System.out.println("Never saw temperature:"+i);

               x=  "Never saw temperature:"+i;}

        return x;
    }
    public static String tally(List<String> votes) {

        Map<String, Integer> io = new HashMap<String, Integer>();
        for (String i : votes) {
            Integer j = io.get(i);
            io.put(i, (j == null) ? 1 : j + 1);
        }

        String x = "";

        for (Map.Entry<String, Integer> val : io.entrySet()) {
            System.out.println(val.getKey() + " " + "votes ==> " + val.getValue());
        if (val.getValue() >2) {
            x = val.getKey();
        }
        }
        return x;
    }
        public static void main (String[]args) {
            System.out.println(Arrays.toString(Role(4)));
            System.out.println("----------------------------------------------------");

            Integer[] arr1 = {1, 2, 3, 4};
            System.out.println(containsDuplicates(arr1));
            System.out.println("----------------------------------------------------");

            Integer[] arr = {90, 88, 70, 73, 100, 50, 76, 64, 85, 91};
            System.out.println(AVG(arr));
            System.out.println("----------------------------------------------------");
            int[][] weeklyMonthTemperatures = {
                    {66, 64, 58, 65, 71, 57, 60},
                    {57, 65, 65, 70, 72, 65, 51},
                    {55, 54, 60, 53, 59, 57, 61},
                    {65, 56, 55, 52, 55, 62, 57}};
            int result1 = 0;
            int result2 = 0;
            int result3 = 0;
            int result4 = 0;
            int j = 0;
            for (int i = 0; i < 4; i++){
                for (j = 0; j < 7; j++) {

                    result1 = weeklyMonthTemperatures[0][j] + result1 / 7;
                    result2 = weeklyMonthTemperatures[1][j] + result2 / 7;
                    result3 = weeklyMonthTemperatures[2][j] + result3 / 7;
                    result4 = weeklyMonthTemperatures[3][j] + result4 / 7;

                }
            }

            System.out.println("the average for each array= "+result1 + " " + result2 + " " + result3 + " " + result4);
            System.out.println("the array with lowest average");
            for (int i = 1; i <=1; i++){
                for (j = 0; j < 7; j++) {
                    System.out.println( weeklyMonthTemperatures[1][j] );

                }}
            System.out.println("the  lowest  average" + result2);
            System.out.println("----------for-lape-3------------------------------------------");
            System.out.println(weeklyMonthTemperatures());
            System.out.println("-----------for-lape-3-----------------------------------------");

            List<String> votes = new ArrayList<>();
            votes.add("Bush");
            votes.add("Bush");
            votes.add("Bush");
            votes.add("Shrub");
            votes.add("Hedge");
            votes.add("Shrub");
            votes.add("Bush");
            votes.add("Hedge");
            votes.add("Bush");
                String winner = tally(votes);
            System.out.println(winner + " received the most votes!");

        }
}
