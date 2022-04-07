package nextstep.blackjack.domain.state;

import nextstep.blackjack.domain.card.Cards;

public abstract class Started implements State {
    Cards cards;

    @Override
    public Cards cards() {
        return null;
    }
}
