package com.yeahbutstill.demojavaoop.aplikasi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceApp {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("README.md")
        )) {
            while (true) {
                String text = bufferedReader.readLine();
                if (text == null) {
                    break;
                }
                System.out.println(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
