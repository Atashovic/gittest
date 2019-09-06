package org.amirxanli;

public class Main {
    public static void main(String[] args) {
        MessageProvider provider = MessageFactory.getProvider();
        MessageRenderer renderer = MessageFactory.getRenderer();

//        MessageProvider provider = new InternetMessageProvider();
//        MessageRenderer renderer = new SimpleMessageRenderer(provider);
        renderer.render();
    }
}
