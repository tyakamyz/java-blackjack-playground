package nextstep.blackjack.domain.state;

import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.domain.card.Card;

public abstract class Finished extends Started{

    public Finished(Cards cards) {
        this.cards = cards;
    }

    abstract public double earningRate();

    @Override
    public State draw(Card card) {
        return null;
    }

    @Override
    public State stay() {
        return null;
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public double profit(double rate) {
        return 0;
    }

}
