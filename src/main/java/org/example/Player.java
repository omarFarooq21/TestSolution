package org.example;

// Responsibilities:
// 1. Create a new player
// 2. Send and receive messages
public class Player {
    // Variables in use...
    private final boolean initiator;
    private String name;
    private int counter;
    private String message;
    private boolean receivedMessage = false;

    // Getters and Setters..
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Player(boolean initiator, String name, String message, int counter) {
        this.initiator = initiator;
        this.name = name;
        this.message = message;
        this.counter = counter;
    }

    public boolean isReceivedMessage() {
        return receivedMessage;
    }

    public void setReceivedMessage(boolean receivedMessage) {
        this.receivedMessage = receivedMessage;
    }

    public void sendFirstMessage(Player player) {
        if(initiator) {
            System.out.println(this.getName() + " is the initiator. Sending message to " + player.getName());
            player.setMessage(message);
            player.setReceivedMessage(true);
            player.setCounter(player.getCounter() + 1);
            System.out.println("Message sent successfully!");
        }
        else {
            System.out.println("Cannot send message as I'm not the initiator");
        }
    }

    public void sendMessageBack(Player player) {
        if(receivedMessage)
        {
            System.out.println(this.getName() + " sending message to " + player.getName());
            this.setReceivedMessage(false);
            player.setMessage(message + " " + player.getCounter());
            player.setCounter(player.getCounter() + 1);
            player.setReceivedMessage(true);

        }
        else  {
            System.out.println("Cannot send message as I have not received anything");
        }
    }

}
