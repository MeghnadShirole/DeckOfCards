package com.company;

import java.util.ArrayList;

public class DeckOfCardsGame {

    /*
     * Created a generic type of array list which is accepting only string type
     */
    ArrayList<String> arrayList = new ArrayList<>();
    /*
     * initialized the size of cards .
     */

    public String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace"};

    /*
     *
     * in this method initializing the suits in ranks
     *
     */
    public void initializeCards() {

        int numOfCards = suits.length * ranks.length;

        /*
         * assigning unique ranks to the suits
         */
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                arrayList.add(suits[i]); //storing elements into arraylist
                arrayList.add(ranks[j]);
            }
        }
    }
}