package task.service;

import task.entity.Catalog;
import task.entity.Category;

import java.util.List;

public class CatalogService {
    public Catalog createCatalog(List<Category> list, String name) {
        return new Catalog(list, name);
    }
    public void addInCatalog(List<Category> list, Category category){
        list.add(category);
    }
}
