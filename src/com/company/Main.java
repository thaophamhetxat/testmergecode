package com.company;

import java.io.*;

public class Main {
private final  static String FINAL_URL="C:\\Users\\bp_thaopt\\Desktop\\onlinebanking\\leanrCode\\out\\production\\leanrCode\\input1.txt";

    public static void main(String[] args){
        File file = new File(FINAL_URL);
        try {
            InputStream inputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println("File not fount!");
        }
    }
}
