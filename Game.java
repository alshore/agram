/*
 * Rather than using the random feature to get a random card from the
 * organized deck, I used it to 'shuffle' the deck, and then pull cards
 * from the top, to simulate more realistic play
 */

package com.andrew;

import java.util.ArrayList;
import java.util.Scanner;
import static com.andrew.Deck.*;
import static com.andrew.Player.*;

public class Game{

    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        //create the deck calling getDeck method from Deck class
        ArrayList<Card> theDeck = Deck.getDeck();
        //shuffle deck using the shuffle method from the deck class
        ArrayList<Card> shuffledDeck = Deck.shuffle(theDeck);
        //create players who each get 3 cards from the top of shuffled deck
        Player user = new Player(1, dealCards(shuffledDeck));
        Player computer1 = new Player(2, dealCards(shuffledDeck));
        Player computer2 = new Player(3, dealCards(shuffledDeck));
        Player computer3 = new Player(4, dealCards(shuffledDeck));
        Player computer4 = new Player(5, dealCards(shuffledDeck));
        ArrayList<Player> players = new ArrayList<>();
        players.add(user);
        players.add(computer1);
        players.add(computer2);
        players.add(computer3);
        players.add(computer4);
        //because this game is dealt three cards at a time, I thought this
        //was the most logical solution for the second round of three cards
        for (Player player : players) {
            player.setHand(addHand(dealCards(shuffledDeck), player.getHand()));
        }
/*
        int choice = user.playerChoice();
        System.out.println("You chose " + user.getHandCard(user.getHand(), choice) + ", is this correct (y or n)?");
        String conf = s.nextLine();
        while (!(conf.equalsIgnoreCase("y"))) {
            choice = user.playerChoice();
            System.out.println("You chose " + user.getHandCard(user.getHand(), choice) + " is this correct (y or n)?");
            conf = s.nextLine();
        }
        user.getHand().remove(choice);
        ArrayList<String> trick1 = new ArrayList<>();
        trick1.add(user.getHandCard(user.getHand(), choice));
        Trick trickOne = new Trick(1, trick1);
*/


        for (Player player : players) {
            for (Card card : user.getHand()) {
                System.out.println("Player " + player.getPlayerNumber() + " cards: " + Card.getCard(card));
            }
        }

        System.out.println("Left over cards:");
        for (Card card : shuffledDeck) {
            System.out.println(Card.getCard(card));
        }
    }
}