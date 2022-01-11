/* @Author : Nayan Tripathi
@Date : 11/01/2021
Workshop Program
 */

package com.deckofcards;

public class DeckofCards {
    public static void main(String args[]){
        System.out.println("Welcome to Deck of Cards!");  //Welcome message
        int[] Deck = new int[52];
        String[] Suits = {"Clubs","Diamonds","Hearts","Spades"};
        String[] Ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

        //Initializing the Cards
        for(int i=0;i<Deck.length;i++){
            Deck[i] = i;
        }

        //Shuffling the Cards
        for (int i=0;i<Deck.length;i++){
            int index = (int)(Math.random()*Deck.length);
            int temp = Deck[i];
            Deck[i] = Deck[index];
            Deck[index] = temp;
        }
    }
}
