package nextstep.blackjack.domain.state;

import nextstep.blackjack.domain.card.PlayingCard;

public abstract class Finished extends Started{

    abstract double earningRate();

    @Override
    public State draw(PlayingCard playingCard) {
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
