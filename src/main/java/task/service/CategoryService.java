package task.service;

import task.entity.Category;
import task.entity.Item;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    public Category createCategory(List<Item> list, String name) {
        return new Category(list, name);
    }

    public void addInCategory (List<Item> list, Item item){
        list.add(item);
    }

}
