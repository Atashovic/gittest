package org.amirxanli;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        MessageRenderer renderer = context.getBean("simpleMessageRenderer", MessageRenderer.class);
        renderer.render();
//        MessageProvider provider = MessageFactory.getProvider();
//        MessageRenderer renderer = MessageFactory.getRenderer();
//
////        MessageProvider provider = new InternetMessageProvider();
////        MessageRenderer renderer = new SimpleMessageRenderer(provider);
//        renderer.render();
    }
}
