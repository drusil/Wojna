import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jakub Czajka
 */
public class PlayerTest {
  Player player;
  Deck deck;

  @BeforeMethod
  public void beforeMethod() {
    deck = creatSimpeDeck();
    player = new Player("player 1", deck);
  }

  private Deck creatSimpeDeck() {
    List<Card> cards = new ArrayList<>();
    cards.add(new Card(CardValue.FOUR, CardSuit.DIMOND));
    cards.add(new Card(CardValue.AS, CardSuit.CLUB));
    cards.add(new Card(CardValue.KING, CardSuit.HEART));
    cards.add(new Card(CardValue.TWO, CardSuit.SPADE));
    return new Deck(cards);
  }


}