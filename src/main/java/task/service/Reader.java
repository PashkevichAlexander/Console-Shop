package task.service;

import java.util.Scanner;

public class Reader {
    Scanner scanner = new Scanner(System.in);

    public int readInt() {
        return scanner.nextInt();
    }

    public double readDouble (){
        return scanner.nextDouble();
    }

    public String readString(){
        return scanner.nextLine();
    }
}
