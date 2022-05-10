package com.hank.mcdonalds;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Mcdonalds {
    Map<String, Item> menu = new HashMap<>();

    public Mcdonalds() {
        File file = new File("mcdonalds.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (line != null) {
                String[] token = line.split(",");
                Item item = new Item(
                        token[0],
                        token[1],
                        Integer.parseInt(token[2]),
                        Integer.parseInt(token[3])
                );
                menu.put(item.id, item);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("讀取 menu 失敗");
        }
    }

    public void printMenu() {
        for (Map.Entry<String, Item> itemEntry : menu.entrySet()) {
            System.out.println(itemEntry.getValue());
        }
    }

    public static void main(String[] args) {
        Mcdonalds mcdonalds = new Mcdonalds();
        mcdonalds.printMenu();
    }
}


