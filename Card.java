package com.andrew;

public class Card {



    private int cardNumber;
    private String cardSuit;

    private int getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    private String getCardSuit() {
        return cardSuit;
    }
    public void setCardSuit(String cardSuit) {
        this.cardSuit = cardSuit;
    }

    Card(int cardNumber, String cardSuit) {
        this.cardNumber = cardNumber;
        this.cardSuit = cardSuit;
    }
    static String getCard(Card card) {
        return card.cardNumber + " of " + card.cardSuit;
    }
}
