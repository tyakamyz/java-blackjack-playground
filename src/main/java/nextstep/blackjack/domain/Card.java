package nextstep.blackjack.domain;

import java.util.HashMap;
import java.util.Map;

public class Card {
    public static int MIN_COUNT = 1;
    public static int MAX_COUNT = 13;

    private static final Map<Type, String> typeToString = new HashMap<>();
    static {
        typeToString.put(Type.DIAMOND, "다이아몬드");
        typeToString.put(Type.SPADE, "스페이드");
        typeToString.put(Type.CLOVER, "클로버");
        typeToString.put(Type.HEART, "하트");
    }

    public enum Type{
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

    public String getCard() {
        return this.number + typeToString.get(this.type);
    }
}
