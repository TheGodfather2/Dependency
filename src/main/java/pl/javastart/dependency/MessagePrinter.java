package pl.javastart.dependency;

public class MessagePrinter {
    private final MessageProducer messageProducer;

    public MessagePrinter(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }
    public void getMessage(){
        System.out.println(messageProducer.getMessage());
    }
}
