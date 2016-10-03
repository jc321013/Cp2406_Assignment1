package Cp2406A1.java;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by jc321013 on 15/09/16.
 */
public class STGame {
//    Initalzing number of cards to deal to each player
    private static final int NUM_CARDS_TO_DEAL = 8;
    private int numPlayers;
    private int dealerID;
    private STPlayer[] players;
    private STDeck deck;
    private int yourPlayerID;



    public STGame(int numPlayers) {
        this.numPlayers = numPlayers;
        deck = new STDeck();

    }

//    Randomly select dealer from 3-5 players
    public static void selectDealer(int numPlayers) {
        int dealerID;
        Random randdealerID = new Random();
        int n = randdealerID.nextInt((numPlayers) + 1);
        dealerID = n;
        System.out.println( "The Dealer is Player " + dealerID);
//        return dealerID;



    }

//    created a loop to randomly deal cards to each player
    public void dealRandomCardsToEachPlayer() {

        players = new STPlayer[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            players[i] = new STPlayer(" Player " + i);
        }


        for (STPlayer player : players) {
            ArrayList<STCard> cards = deck.dealCards(NUM_CARDS_TO_DEAL);
            player.setCards(cards);
            System.out.println(player.toString());


            }


        }


    public void selectYouAsPlayer() {
        yourPlayerID = 0;


    }

    public STPlayer getHumanPlayer() {
        int yourPlayerID = 0;
        return players[yourPlayerID];
    }

    public void playGame() {
        boolean gameIsOn = true;
        while (gameIsOn) {


            for (int i = 0; i < players.length; i++) {




            }




                }


        }



    }





