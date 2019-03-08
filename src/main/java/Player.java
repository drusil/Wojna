import java.util.ArrayList;

/**
 * @author Jakub Czajka
 */
public class Player {
  private String name;
  private Deck activeDeck;
  private Deck discardPile;

  public Player(String name) {
    this.name = name;
    this.activeDeck = new Deck(new ArrayList<>());
    this.discardPile = new Deck(new ArrayList<>());
  }
}
