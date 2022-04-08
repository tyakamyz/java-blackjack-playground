package nextstep.blackjack.domain.card;

public class Card {

    public Denomination denomination;
    public Suit suit;

    Card(Denomination denomination, Suit suit){
        this.denomination = denomination;
        this.suit = suit;
    }

}
