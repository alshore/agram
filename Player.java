package com.andrew;

import java.io.IOException;
import java.util.ArrayList;
import static com.andrew.Card.getCard;
import java.util.Scanner;

public class Player {

    Scanner s = new Scanner(System.in);
    //initialize variables
    private int playerNumber;
    private ArrayList hand;

    public int getPlayerNumber() {
        return playerNumber;
    }
    //getter and setter for the hand
    ArrayList<Card> getHand() {
        return hand;
    }

    void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    String getHandCard(ArrayList<Card> hand, int position) {
        return getCard(hand.get(position));
    }
    //player constructor
    Player(int playerNumber, ArrayList<Card> hand) {
        this.playerNumber = playerNumber;
        this.hand = hand;
    }
    int playerChoice() {

        System.out.println("Player 1, please select a number of card to play: ");
        for (int i = 0; i < this.getHand().size(); i++) {
            System.out.println(i + 1 + ":  " + this.getHandCard(this.getHand(), i));
        }
        return s.nextInt() - 1;
    }
}
