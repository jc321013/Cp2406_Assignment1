package Cp2406A1.java;

import java.util.ArrayList;

/**
 * Created by jmarc on 30/09/2016.
 */
public class STDealer {
    private ArrayList<STCard> cards;
    private String dealerId;

    public STDealer(String dealerId) {
        this.dealerId = dealerId;
    }


    public void setCards(ArrayList<STCard> cards) {
        this.cards = cards;
    }


    public String toString(){
        return "DealerId=" + dealerId + "\n cards=" + cards;
    }


    }


