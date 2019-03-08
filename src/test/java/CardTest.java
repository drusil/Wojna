import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Jakub Czajka
 */
public class CardTest {
  Card card;

  @BeforeTest
  public void beforeTest() {
    card = new Card(CardValue.FOUR, CardSuit.DIMOND);
  }

  @Test
  public void whenToStringThenCorrectReturn() {
    assertEquals("4♦", card.toString());
  }

  @Test
  public void whenGetValueThenReturnIntValue() {
    assertEquals(4, card.getValue());
  }

}