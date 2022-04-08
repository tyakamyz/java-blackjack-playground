package nextstep.blackjack.domain.card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cards {
    List<Card> cards;

    public Cards(){
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public boolean isBust() {
        return false;
    }

    public void createPlayingCardDeck(){
        for(Suit suit : Suit.values()){
            Arrays.stream(Denomination.values()).forEach(denomination -> this.cards.add(new Card(denomination, suit)));
        }
    }
}
