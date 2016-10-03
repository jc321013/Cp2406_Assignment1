package Cp2406A1.java;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by jc321013 on 15/09/16.
 */
public class STGame {
    private static final int NUM_CARDS_TO_DEAL = 8;
    private int numPlayers;
    private int numDealers;
    private int dealerID;
    private STPlayer[] players;
    private STDeck deck;
    int yourPlayerId;

    public STGame(int numPlayers) {
        this.numPlayers = numPlayers;
        deck = new STDeck();

    }

    public static int selectDealer(int numPlayers) {
        //todo; google how to get random int in java
        int dealerID;
        //int numPlayers;
        Random randdealerID = new Random();
        int n = randdealerID.nextInt((numPlayers) + 1);
        dealerID = n;
        System.out.println( "Dealer is player " + dealerID);
        return dealerID;



    }

    public void dealRandomCardsToEachPlayer() {

        players = new STPlayer[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            players[i] = new STPlayer("PlayerId=" + i);
        }


        for (STPlayer player : players) {
            ArrayList<STCard> cards = deck.dealCards(NUM_CARDS_TO_DEAL);
            player.setCards(cards);
        }
    }

    public void selectYouAsPlayer() {
//        todo; randomly?
         yourPlayerId = 0;
    }

    public STPlayer getHumanPlayer() {

        return players[yourPlayerId];
    }

    public void playGame() {
        boolean gameIsOn = true;
        while (gameIsOn) {

//            todo; setup players in correct order
            for (int i = 0; i < players.length; i++) {

//                todo; check humanPlayer


            }
//            showTurnPlayer();



                }


        }



//    public void exitGame() {
//        boolean gameIsOn = false;
//        if(!gameIsOn) {
//            System.out.println("Game Finished");
//        }
////
//        }
    }





