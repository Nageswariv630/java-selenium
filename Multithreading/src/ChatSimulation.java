class Chat {
    private boolean senderTurn = true;

    public synchronized void send(String message) throws InterruptedException {
        while (!senderTurn) {
            wait();
        }
        System.out.println("Sender: " + message);
        senderTurn = false;
        notify();
    }

    public synchronized void receive(String message) throws InterruptedException {
        while (senderTurn) {
            wait();
        }
        System.out.println("Receiver: " + message);
        senderTurn = true;
        notify();
    }
}

class Sender extends Thread {
    private Chat chat;
    private String[] messages = {
        "Hi!",
        "How are you?",
        "What are you doing?",
        "Let's catch up later.",
        "Bye!"
    };

    public Sender(Chat chat) {
        this.chat = chat;
    }

    public void run() {
        for (String msg : messages) {
            try {
                chat.send(msg);
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Receiver extends Thread {
    private Chat chat;
    private String[] replies = {
        "Hello!",
        "I'm fine.",
        "Just working.",
        "Sure, sounds good.",
        "See you!"
    };

    public Receiver(Chat chat) {
        this.chat = chat;
    }

    public void run() {
        for (String reply : replies) {
            try {
                chat.receive(reply);
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class  ChatSimulation{
    public static void main(String[] args) {
        Chat chat = new Chat();
        new Sender(chat).start();
        new Receiver(chat).start();
    }
}

