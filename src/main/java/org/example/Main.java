package org.example;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Instance of the class Player:
        Player player1 = new Player(true, "player 1", "Hello", 0);
        Player player2 = new Player(false, "player 2", "", 0);

        //Sending the first message...
        player1.sendFirstMessage(player2);

        // Conversation taking place
        for (int i = 0; i < 10; i++) {
            player2.sendMessageBack(player1);
            System.out.println(player1.getMessage());
            player1.sendMessageBack(player2);
            System.out.println(player2.getMessage());
        }
    }
}

