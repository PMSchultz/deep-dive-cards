package edu.cnm.deepdive.cards;

import java.util.Comparator;

public class Test {

  public static void main(String[] args) {
    //local class
    /** class AlternateSorter implements Comparator<Card> {

    @Override public int compare(Card card1, Card card2) {
    if (card1.rank != card2.rank) {
    return card1.rank.compareTo(card2.rank);
    }
    return card1.suit.compareTo(card2.suit);
    }
    }*/
    Deck deck = new Deck();
    deck.shuffle();
    System.out.println(deck);
    deck.sort();
    System.out.println(deck);
    //create a comparator object using our overloading constructor
    //deck.sort(new AlternateSorter());

    //Anonymous class defined inside sort
    deck.sort(new Comparator<Card>() {
      public int compare(Card card1, Card card2) {
        if (card1.rank != card2.rank) {
          return card1.rank.compareTo(card2.rank);
        }

        return card1.suit.compareTo(card2.suit);
      }
    });

    System.out.println(deck);
  }
}

//Lambda expression with implicit body and return
//deck.sort((card1, card2) -> (card1.rank != card2.rank)
 //   ? card1.rank.compareTo(card2.rank)
 //   : card1.suit.compareTo(card2.suit));
 //   System.out.println(deck);


//Lamda expression with explicit body and return
//deck.sort((card1, card2) -> {
//   if(card1.rank != card2.rank{
//    : card1.suit.compareTo(card2.suit));
//   System.out.println(deck);
  //Nested class (must be static)
  /**private static class AlternateSorter implements Comparator<Card>{

  @Override public int compare(Card card1, Card card2) {
  if (card1.rank != card2.rank){
  return card1.rank.compareTo(card2.rank);
  }
  return card1.suit.compareTo(card2.suit);
  }
  } */
//create a class that implements Comparator
//can take the AlternateSorter class and put inside Test class (not in the public static void
//main method
// top (non-public) level class

/**class AlternateSorter implements Comparator<Card>{

@Override public int compare(Card card1, Card card2) {
if (card1.rank != card2.rank){
return card1.rank.compareTo(card2.rank);
}
return card1.suit.compareTo(card2.suit);
} */

