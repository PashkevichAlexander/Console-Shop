package task.service;

import task.entity.Item;

public class ItemService {
    public Item createItem() {
        Reader read = new Reader();
        int id = read.readInt();
        String name = read.readString();
        double price = read.readDouble();

        return new Item(id, name, price);
    }
}
