package task.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Catalog {
    private List<Category> catalog;
    private String name;
}
