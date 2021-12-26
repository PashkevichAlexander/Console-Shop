package task.app;

import task.service.Reader;

public class App {
    private static final String menu = """
            2 - AddCategoryInCatalog
            3 - AddItemInCategory
            4 - PrintCatalog
            """;
    public void run(){
        while (true){
            Reader reader = new Reader();
            int num = reader.readInt();
            switch (num){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;

            }
        }
    }
}
