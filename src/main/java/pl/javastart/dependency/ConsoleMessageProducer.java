package pl.javastart.dependency;

import java.util.Scanner;

public class ConsoleMessageProducer implements MessageProducer{
    @Override
    public String getMessage() {
        System.out.println("Daj tekst: ");
        return new Scanner(System.in).nextLine();
    }
}
