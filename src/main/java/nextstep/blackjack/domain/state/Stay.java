package nextstep.blackjack.domain.state;

import nextstep.blackjack.domain.card.Cards;

public class Stay extends Finished{
    public Stay(Cards cards) {
        super(cards);
    }

    @Override
    public double earningRate() {
        return 0;
    }
}