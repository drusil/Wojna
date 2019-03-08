import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Jakub Czajka
 */
public class Deck {
  private List<Card> deck;

  public Deck(List<Card> deck) {
    this.deck = new ArrayList<>();
    this.deck = deck;
  }

  public void shuffle() {
    Collections.shuffle(deck);
  }

  @Override
  public String toString() {
    return deck.toString();
  }

  public Card getTopCard() throws NoMoreCardsException {
    if (!deck.isEmpty()) {
      return deck.remove(deck.size() - 1);
    } else {
      throw new NoMoreCardsException();
    }
  }

  public void addCard(Card card) {
    deck.add(card);
  }

}
