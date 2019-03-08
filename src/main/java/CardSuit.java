
/**
 * @author Jakub Czajka
 */
public enum CardSuit {

  DIMOND('♦'), CLUB('♣'), HEART('♥'), SPADE('♠'), JOKER('R');
  private char color;

  CardSuit(char color) {
    this.color = color;
  }

  public char getColor() {
    return this.color;
  }
}
