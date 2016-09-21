package Cp2406A1.java;

import Cp2406A1.java.STGame;

/**
 * Created by jc321013 on 15/09/16.
 */
public class A1 {
    private static final int NEW_GAME = 1;

    public static void main(String[] args) {


        showWelcome();
        showMenu();
        int opt = getUserMenuChoice();
        STGame game;
        if(opt == NEW_GAME) {
            game = startNewGame();
            game.playGame();

        }
        }

    private static STGame startNewGame() {

        int numPlayers = getNumPlayers();
        STGame game = new STGame(numPlayers);
        game.selectDealer();
        game.dealRandomCardsToEachPlayer();

        game.selectYouAsPlayer();

        STPlayer humanPlayer = game.getHumanPlayer();
        showPlayer(humanPlayer);

//        game.playGame();

//        dealCards();
        return game;
    }

    private static void showPlayer(STPlayer humanPlayer) {
        System.out.println("human player=" + humanPlayer);
    }

    private static int getNumPlayers() {
        //todo: see prac how to get the number
        return 3;
    }


    private static int getUserMenuChoice() {
        //todo: see prac how to get integer value
        return 1;
    }

    private static void showMenu() {
        System.out.println("1. Start Game");
        System.out.println("2. Exit");
    }

    private static void showWelcome() {
        System.out.println("Welcome");
    }
}
