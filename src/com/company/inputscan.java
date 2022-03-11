package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class inputscan {
    private final static String FIRE_URL = "C:\\Users\\bp_thaopt\\Desktop\\onlinebanking\\leanrCode\\out\\production\\leanrCode\\input1.txt";

    public static void main(String[] args) throws IOException {
        int n, max = 100;
        int Arr[] = new int[max];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter size:");
            n = scanner.nextInt();
        } while (n <= 2 || n > max - 1);

        System.out.println("enter string: ");
        try {
            for (int i = 0; i < n; i++) {
                System.out.print("Arr[" + i + "] = ");
                Arr[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("fail");
        } finally {
            File file = new File(FIRE_URL);
            OutputStream outputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

            for (int i : Arr) {
                outputStreamWriter.write(i);
                outputStreamWriter.write("\n");
            }
            outputStreamWriter.flush();
        }

    }
}
