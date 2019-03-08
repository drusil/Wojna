import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.testng.Assert.*;

/**
 * @author Jakub Czajka
 */
public class DeckTest {
  Crupier crupier;
  Deck deck;

  @BeforeMethod
   public void beforeTest(){
     crupier = new Crupier();
     deck = crupier.get52Plus2JokerDeck();
   }

   @Test
  public void youCanGetFirstCardFromTheTop(){
    Card card = new Card(CardValue.JOKER,CardSuit.JOKER);
    Card topCardFromDeck = deck.getTopCard();
    assertEquals(card.getValue(),topCardFromDeck.getValue());
    assertEquals(card.toString(),topCardFromDeck.toString());
   }

   @Test(expectedExceptions = NoMoreCardsException.class)
  public void whenNoMoreCardsInDeckThenOutOfTheCardExceptionIsThrown(){
     IntStream.rangeClosed(1,54).forEach(x -> deck.getTopCard());
     deck.getTopCard();
   }





}