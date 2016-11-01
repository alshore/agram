package com.andrew;

import java.util.ArrayList;
import java.util.Random;

class Deck {

    //get deck method returns an un-shuffled deck as an array list
    static ArrayList<Card> getDeck() {
        //create array list
        ArrayList<Card> deckOfCards = new ArrayList<>();
        //use for loops to create new cards of each suit
        for (int i = 3; i < 12; i++) {
            deckOfCards.add(new Card(i, "Clubs"));
        }

        for (int j = 3; j < 12; j++) {
            deckOfCards.add(new Card(j, "Diamonds"));
        }

        for (int k = 3; k < 12; k++) {
            deckOfCards.add(new Card(k, "Hearts"));
        }

        for (int l = 3; l < 11; l++) {
            deckOfCards.add(new Card(l, "Spades"));
        }
        return deckOfCards;
    }
    //shuffle method randomly organizes all cards and returns new deck
    static ArrayList<Card> shuffle(ArrayList<Card> theDeck) {
        ArrayList<Card> shuffledDeck = new ArrayList<>();
        for (int i = 0; i < 35; i++) {
            Card j = randomCard(theDeck);
            shuffledDeck.add(theDeck.get(theDeck.indexOf(j)));
            theDeck.remove(theDeck.indexOf(j));
        }
        return shuffledDeck;
    }

    //random card method used in the shuffling process
    private static Card randomCard(ArrayList<Card> theDeck) {
        int k = new Random().nextInt(theDeck.size());
        return theDeck.get(k);
    }

    //method used in instatiation of player objects
    static ArrayList<Card> dealCards(ArrayList<Card> deck) {
        ArrayList<Card> hand = new ArrayList<>();
        Card card = deck.get(0);
        hand.add(card);
        deck.remove(card);
        Card card2 = deck.get(0);
        hand.add(card2);
        deck.remove(card2);
        Card card3 = deck.get(0);
        hand.add(card3);
        deck.remove(card3);
        return hand;
    }

    //method used to add cards to the hands of players
    static ArrayList<Card> addHand(ArrayList<Card> deck, ArrayList<Card> hand) {
        Card card = deck.get(0);
        hand.add(card);
        deck.remove(card);
        Card card2 = deck.get(0);
        hand.add(card2);
        deck.remove(card2);
        Card card3 = deck.get(0);
        hand.add(card3);
        deck.remove(card3);
        return hand;
    }
}
