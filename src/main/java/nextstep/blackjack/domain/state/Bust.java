package nextstep.blackjack.domain.state;

import nextstep.blackjack.domain.card.Cards;

public class Bust extends Finished{
    public Bust(Cards cards) {
        super(cards);
    }

    @Override
    public double earningRate() {
        return 0;
    }
}
