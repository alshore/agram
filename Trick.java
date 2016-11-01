package com.andrew;

import java.util.ArrayList;

public class Trick {

    private int trickNumber;
    private ArrayList playedCards = new ArrayList<>();

    public int getTrickNumber() {
        return trickNumber;
    }
    public void setTrickNumber(int trickNumber) {
        this.trickNumber = trickNumber;
    }
    public ArrayList getPlayedCards() {
        return playedCards;
    }
    public void setPlayedCards(ArrayList<Card> playedCards) {
        this.playedCards = playedCards;
    }

    Trick(int trickNumber, ArrayList<String> playedCards) {
        this.trickNumber = trickNumber;
        this.playedCards = playedCards;
    }
}
