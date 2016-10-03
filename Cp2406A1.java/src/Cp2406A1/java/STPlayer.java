package Cp2406A1.java;

import java.util.ArrayList;

/**
 * Created by jc321013 on 15/09/16.
 */

public class STPlayer {
    private ArrayList<STCard> cards;
    private String playerID;

    public STPlayer(String playerId) {
        this.playerID = playerId;
    }


    public void setCards(ArrayList<STCard> cards) {
        this.cards = cards;
    }

    public String toString(){

        return " PlayerId= " + playerID + "\n" + playerID + " cards are: " + cards;
    }
}
