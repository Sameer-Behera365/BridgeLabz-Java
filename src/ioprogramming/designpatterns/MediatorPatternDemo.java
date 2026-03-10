package ioprogramming.designpatterns;

interface ChatMediator {
    void sendMessage(String msg, ChatUser user);
}

class ChatRoom implements ChatMediator {
    public void sendMessage(String msg, ChatUser user) {
        System.out.println(user.getName() + ": " + msg);
    }
}

class ChatUser {
    private String name;
    private ChatMediator mediator;

    public ChatUser(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void send(String msg) {
        mediator.sendMessage(msg, this);
    }
}

public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();
        ChatUser user = new ChatUser("User", mediator);
        user.send("Hello");
    }
}