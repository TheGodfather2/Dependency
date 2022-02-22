package pl.javastart.dependency;

public class SimpleMessageProducer implements MessageProducer{
    @Override
    public String getMessage() {
        return "Example Message";
    }
}
