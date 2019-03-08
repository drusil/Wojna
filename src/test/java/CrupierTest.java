import org.testng.annotations.BeforeTest;

/**
 * @author Jakub Czajka
 */
public class CrupierTest {

  Crupier crupier;

  @BeforeTest
  public void beforeTest() {
    crupier = new Crupier();
  }

  /*@Test
  public void crupierCreate52And2JokerDeck(){
    List<String> expectedCardList = Arrays.asList("2♦", "3♦", "4♦", "5♦", "6♦", "7♦", "8♦","9♦", "10♦", "J♦", "Q♦", "K♦", "A♦", "2♣", "3♣", "4♣", "5♣", "6♣", "7♣", "8♣", "9♣", "10♣", "J♣", "Q♣", "K♣", "A♣", "2♥", "3♥", "4♥", "5♥", "6♥", "7♥", "8♥", "9♥", "10♥", "J♥", "Q♥", "K♥", "A♥", "2♠", "3♠", "4♠","5♠", "6♠", "7♠", "8♠", "9♠", "10♠", "J♠", "Q♠", "K♠", "A♠", "JR", "JR");
    assertEquals(expectedCardList.toString(),crupier.get52Plus2JokerDeck());
  }
  */
}