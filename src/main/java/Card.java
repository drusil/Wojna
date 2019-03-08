/**
 * @author Jakub Czajka
 */
public class Card {
  CardValue cardValue;
  CardSuit cardSuit;

  public Card(CardValue cardValue, CardSuit cardSuit) {
    this.cardValue = cardValue;
    this.cardSuit = cardSuit;
  }

  @Override
  public String toString() {
    return  cardValue.getName() + cardSuit.getColor();
  }

  public int getValue() {
    return cardValue.getValue();
  }
}
