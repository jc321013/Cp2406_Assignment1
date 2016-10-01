package Cp2406A1.java;

import java.util.Scanner;

/**
 * Created by jc321013 on 15/09/16.
 */
public class A1 {
    private static final int NEW_GAME = 1;
    private static final int END_GAME = 2;
//    private static final int NUM_PLAYERS = 1;


    public static void main(String[] args) {


        showWelcome();
        showMenu();
        int opt = getUserMenuChoice();
        STGame game;
        if (opt == NEW_GAME) {
            game = startNewGame();
            game.playGame();
            //            game = startNewGame();
//            game.selectDealer();
        }
        if (opt == END_GAME) {
            endGame();
//            game.exitGame();        }


        }
    }



    private static void endGame() {
        System.out.println("Thanks for playing");
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
//        todo: see prac how to get the number(Done)
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.print("How many people will be playing: ");
        choice = input.nextInt();
        System.out.println("There are" + choice + "people playing");
        if (choice > 3 && choice < 5)
            return choice;
        else {
            if( choice < 3 || choice > 5)
                System.out.println("You need to have 3-5 Players");
            return choice;
        }


    }




    private static int getUserMenuChoice() {
        //todo: see prac how to get integer value(Done)
        int selection;
        Scanner input = new Scanner(System.in);
        System.out.print("Choose option: ");
        selection = input.nextInt();
        return selection;

    }

    private static void showMenu() {
        System.out.println("1. Start Game");
        System.out.println("2. Exit");
    }

    private static void showWelcome() {
        System.out.println("Welcome");
    }
}
