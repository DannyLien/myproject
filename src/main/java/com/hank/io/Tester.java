package com.hank.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Tester {
    public static void main(String[] args) {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        try {
            FileInputStream is = new FileInputStream(file);
            int n = is.read();
//            System.out.println(n);
//            System.out.println(is.read());
//            System.out.println(is.read());
//            System.out.println(is.read());
            while (n != -1) {
                System.out.print((char) n);
                n = is.read();
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("message");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File open success");
    }
}
