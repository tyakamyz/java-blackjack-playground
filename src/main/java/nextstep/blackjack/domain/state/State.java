package nextstep.blackjack.domain.state;

import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.domain.card.Card;

public interface State {

    State draw(Card card);

    State stay();

    boolean isFinished();

    Cards cards();

    double profit(double rate);

}
