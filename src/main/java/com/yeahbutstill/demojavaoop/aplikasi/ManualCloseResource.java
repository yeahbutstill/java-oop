package com.yeahbutstill.demojavaoop.aplikasi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManualCloseResource {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(
                    new FileReader("README.md")
            );
            while (true) {
                String text = bufferedReader.readLine();
                if (text == null) {
                    break;
                }
                System.out.println(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
