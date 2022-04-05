package nextstep.blackjack;

import org.junit.jupiter.api.Test;

class CardsTest {

    @Test
    void createCardDecks() {
        Cards cards = new Cards();
        cards.createCardDecks();

        cards.decks.forEach(card -> System.out.println(card.number + " " + card.type.toString()));
    }
}