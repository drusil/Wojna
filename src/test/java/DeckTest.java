import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Jakub Czajka
 */
public class DeckTest {
  Crupier crupier;
  Deck deck;

  @BeforeMethod
  public void beforeTest() {
    crupier = new Crupier();
    deck = crupier.get52Plus2JokerDeck();
  }

  @Test
  public void youCanGetFirstCardFromTheTop() throws NoMoreCardsException {
    Card card = new Card(CardValue.JOKER, CardSuit.JOKER);
    Card topCardFromDeck = deck.getTopCard();
    assertEquals(card.getValue(), topCardFromDeck.getValue());
    assertEquals(card.toString(), topCardFromDeck.toString());
  }

  @Test(expectedExceptions = NoMoreCardsException.class)
  public void whenNoMoreCardsInDeckThenOutOfTheCardExceptionIsThrown() throws NoMoreCardsException {
    for (int i = 0; i < 55; i++) {
      deck.getTopCard();
    }
    deck.getTopCard();
  }


}