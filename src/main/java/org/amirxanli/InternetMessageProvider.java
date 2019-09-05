package org.amirxanli;

public class InternetMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "message from Internet";
    }
}
