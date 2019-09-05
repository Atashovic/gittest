package org.amirxanli;

public class Main {
    public static void main(String[] args) {
        MessageProvider provider = new InternetMessageProvider();
        MessageRenderer renderer = new SimpleMessageRenderer(provider);
        renderer.render();
    }
}
