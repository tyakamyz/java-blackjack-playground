package nextstep.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CardsTest {

    @Test
    void createCardDecks() {
        Cards cards = new Cards();
        cards.createCardDecks();

        cards.decks.forEach(card -> System.out.println(card.number + " " + card.type.toString()));
    }

    @Test
    void chooseCard() {
        Cards cards = new Cards();
        cards.createCardDecks();

        Card card = cards.chooseCard();
        //System.out.println(card.number + " " + card.type.toString());

        assertThat(cards.decks.size()).isEqualTo(51);
    }
}