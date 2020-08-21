package ru.job4j.tracker;

public class Sample {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item[] getItems() {
        return items;
    }

    public int getIds() {
        return ids;
    }

    /*public Sample(int ids, int size){
        this.ids = ids;
        this.size = size;
    }*/

    public Item add(Item item) {
        item.setId(ids++);
//        item.setName("pr");
        items[size++] = item;
        return item;
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        Item item = new Item();
        Item item1 = new Item();
        sample.add(item);
        sample.add(item1);

        sample.items[0] = item;
        sample.items[1] = item;
        String[] seasons = new String[4];
        int[] myArray = new int[10];

        System.out.println(sample.getItems()[0].getName());
        System.out.println(sample.getIds());
        System.out.println(sample.items.length);

    }
}