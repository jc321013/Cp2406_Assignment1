package Cp2406A1.java;

import java.util.ArrayList;
import java.util.Random;


/**
 * Created by jc321013 on 15/09/16.
 */
public class STDeck {
    private static final int NUM_CARDS_INIT = 60;
    private ArrayList<STCard> cards;
//    private STDeckBuilder deckBuilder;

    //todo: list of all cards

    public STDeck() {
        cards = new ArrayList<STCard>();

        for (int i = 0; i < NUM_CARDS_INIT; i++) {
              cards.add(new STCard(i));
            //todo: get all lists and random at suffle
            //google how to create random array of integers

        }
//        deckBuilder = new STDeckBuilder();
//        cards = deckBuilder.buildDeck();
    }
    public ArrayList<STCard> dealCards(int numCards) {
        ArrayList<STCard> ret = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            int idx = new Random().nextInt(cards.size());
            STCard card = cards.remove(idx);
            ret.add(card);
            System.out.println("\n card" + card);
        }
        return ret;
    }






}
