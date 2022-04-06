package nextstep.blackjack;

public abstract class Player {
    enum Type{
        DEALER,
        GAMER
    }

    public Cards cards;

    public abstract void startCardsSetting(Cards cardDeck);
}
