package myproject.week2;

import myproject.week2.model.Card;

public class TestCard {
 
    public static void main(String[] args) {
        String[] suits = {"Club", "Hearth", "Spade", "Diamond"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        Card[] deck = new Card[52];

        for(int i = 0; i < suits.length; i++) {

            for(int j = 0; j < ranks.length; j++) {
                int index = j+(ranks.length*i);
                deck[index] = new Card(ranks[j], suits[i]);
            }
        }
        for(Card card: deck) {
            System.out.println(card);
        }
    }
    

}
