package nextstep.blackjack.domain.card;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CardsTest {

    @Test
    void isBust() {
    }

    @Test
    void createPlayingCardDeck() {
        Cards playingCardDeck = new Cards();
        playingCardDeck.createPlayingCardDeck();

        playingCardDeck.cards.forEach(card -> System.out.println(card.denomination.getScore() + card.suit.toString()));

        assertThat(playingCardDeck.cards.size()).isEqualTo(52);
    }
}