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

    @Test
    void getSum() {
        Cards cards = new Cards();
        cards.addCard(new Card(Card.Type.CLOVER, 1));
        cards.addCard(new Card(Card.Type.HEART, 10));

        assertThat(cards.getSum()).isEqualTo(21);

        cards = new Cards();
        cards.addCard(new Card(Card.Type.CLOVER, 1));
        cards.addCard(new Card(Card.Type.HEART, 11));

        assertThat(cards.getSum()).isEqualTo(12);
    }
}