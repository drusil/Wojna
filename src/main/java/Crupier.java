import java.util.ArrayList;
import java.util.List;

/**
 * @author Jakub Czajka
 */
public class Crupier {

  public Deck get52Plus2JokerDeck() {
    List<Card> deckList = new ArrayList<Card>();
    for (CardSuit suit : CardSuit.values()) {
      if (suit != CardSuit.JOKER) {
        for (CardValue value : CardValue.values()) {
          if (value != CardValue.JOKER) {
            deckList.add(new Card(value, suit));
          }
        }
      }
    }
    addJokers(deckList, 2);
    return new Deck(deckList);
  }

  private void addJokers(List<Card> deckList, int numberOfJokers) {
    for (int i = 0; i < numberOfJokers; i++) {
      deckList.add(new Card(CardValue.JOKER, CardSuit.JOKER));
    }
  }


}
