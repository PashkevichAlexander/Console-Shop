package task.service;

import task.entity.Item;

public class ItemService {
    public Item createItem(int id, String name, int price) {
        return new Item(id, name, price);
    }
}
