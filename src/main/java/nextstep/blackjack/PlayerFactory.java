package nextstep.blackjack;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    private static final Map<Player.Type, Player> creators = new HashMap<>();

    static {
        creators.put(Player.Type.DEALER, new Dealer());
        creators.put(Player.Type.GAMER, new Gamer());
    }

    Player create(Player.Type type){
        return creators.get(type);
    }
}