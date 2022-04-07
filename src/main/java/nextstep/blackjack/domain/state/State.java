package nextstep.blackjack.domain.state;

import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.domain.card.PlayingCard;

public interface State {

    State draw(PlayingCard playingCard);

    State stay();

    boolean isFinished();

    Cards cards();

    double profit(double rate);

}
