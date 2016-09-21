package Cp2406A1.java;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by jc321013 on 15/09/16.
 */
public class STDeck {
    private static final int NUM_CARDS_INIT = 60;
    private ArrayList<STCard> cards;

    //todo: list of all cards

    public STDeck() {
        cards = new ArrayList<STCard>();

        for (int i = 0; i < NUM_CARDS_INIT; i++) {
              cards.add(new STCard(i));
            //todo: get all lists and random at suffle
            //google how to create random array of integers

        }
    }
    public ArrayList<STCard> dealCards(int nCards) {
        ArrayList<STCard> ret = new ArrayList<STCard>();
        for (int i = 0; i < nCards; i++) {
            int idx = new Random().nextInt(cards.size());
            STCard card = cards.remove(idx);
            ret.add(card);
            System.out.println("\n card=" + card);
        }
        return ret;
    }

}