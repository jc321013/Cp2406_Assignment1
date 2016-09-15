package Cp2406A1.java;

import java.util.ArrayList;

/**
 * Created by jc321013 on 15/09/16.
 */
public class STGame {
    private static final int NUM_CARDS_TO_DEAL = 8;
    private int numPlayers;
    private int dealerId;
    private STPlayer[] players;
    private STDeck deck;

    public STGame(int numPlayers) {
        this.numPlayers = numPlayers;

    }

    public void selectDealer() {
        //todo; google how to get random int in java
        dealerId = 1;
    }

    public void dealRandomCardsToEachPlayer() {

        players = new STPlayer[numPlayers];
        for (STPlayer player : players) {
            ArrayList<STCard> card = deck.dealCards(NUM_CARDS_TO_DEAL);
            player.setCards();
        }
    }
}
