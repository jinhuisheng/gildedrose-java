package com.gildedrose;

import com.gildedrose.item.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TexttestFixture {
    public static void main(String[] args) {
        String result = getBaseline();
        System.out.println(result);
    }

    public static String getBaseline() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        printStream.println("OMGHAI!");

        Item[] items = new Item[]{
                new Item("+5 Dexterity Vest", 10, 20), //
                new AgedItem(2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new SulfurasItem(0, 80), //
                new SulfurasItem(-1, 80),
                new BackstageItem(15, 20),
                new BackstageItem(10, 49),
                new BackstageItem(5, 49),
                new BackstageItem(1, 20),
                // this conjured item does not work properly yet
                new ConjuredItem(3, 6)};

        GildedRose app = new GildedRose(items);

        int days = 3;
        for (int i = 0; i < days; i++) {
            printStream.println("-------- day " + i + " --------");
            printStream.println("name, sellIn, quality");
            for (Item item : items) {
                printStream.println(item);
            }
            printStream.println();
            app.passOneDay();
        }
        return out.toString();
    }

}
