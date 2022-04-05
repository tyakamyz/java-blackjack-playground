package nextstep.blackjack;

public class Card {
    public static int MIN_COUNT = 1;
    public static int MAX_COUNT = 13;

    enum Type{
        DIAMOND,
        SPADE,
        CLOVER,
        HEART
    }

    public Type type;
    public int number;

    public Card(Type type, int number) {
        this.type = type;
        this.number = number;
    }
}
