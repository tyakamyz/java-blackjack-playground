package nextstep.blackjack.domain.state;

import nextstep.blackjack.domain.card.Cards;

public abstract class Running extends Started {

    public Running(Cards cards) {
        this.cards = cards;
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
