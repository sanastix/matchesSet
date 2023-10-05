package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("input.txt"));
        int N = in.nextInt();
        in.nextLine();

        PrintWriter out = new PrintWriter("output.txt");

        for (int i = 0; i < N; i++) {
            String[] line = in.nextLine().split(" ");
            HashMap<Integer, Integer> matchsticks = new HashMap<>();

            for (String length : line) {
                int num = Integer.parseInt(length);
                matchsticks.put(num, matchsticks.getOrDefault(num, 0) + 1);
            }

            int pairsCount = 0;
            for (int count : matchsticks.values()) {
                pairsCount += count / 2;
            }

            if (pairsCount >= 3) {
                out.println("yes");
            } else {
                out.println("no");
            }
        }

        out.close();
    }
}
