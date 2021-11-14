package com.company;

public class DecKOfCardsMain {

    public static void main(String[] args) {
        /*
         * printing the welcome message
         */
        System.out.println("\n*-*-*-* Welcome to Deck Of Cards *-*-*-*");

        /*
         * created object of the DeckOfCardsGame
         */
        DeckOfCardsGame deckOfCardsGame = new DeckOfCardsGame();

        /*
         * Using Object reference calling the method of DeckOfCards Class
         */
        deckOfCardsGame.initializeCards();
    }
}
