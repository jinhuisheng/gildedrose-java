package com.gildedrose;

import com.gildedrose.item.AgedItem;
import com.gildedrose.item.BackstageItem;
import com.gildedrose.item.Item;
import com.gildedrose.item.SulfurasItem;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TextTestFixture {
    public static void main(String[] args) {
        String out = getBaseline();
        System.out.println(out);
    }

    public static String getBaseline() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        printStream.println("OMGHAI!");

        Item[] items = new Item[]{
                Item.createItem("+5 Dexterity Vest", 10, 20), //
                new AgedItem(2, 0), //
                Item.createItem("Elixir of the Mongoose", 5, 7), //
                new SulfurasItem(0, 80), //
                new SulfurasItem(-1, 80),
                new BackstageItem(15, 20),
                new BackstageItem(10, 49),
                new BackstageItem(5, 49),
                new BackstageItem(1, 20),
                // this conjured item does not work properly yet
                Item.createItem("Conjured Mana Cake", 3, 6)};

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
