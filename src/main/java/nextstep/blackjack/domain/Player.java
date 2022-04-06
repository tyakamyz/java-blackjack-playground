package nextstep.blackjack.domain;

import java.util.List;

public abstract class Player {

    public abstract void getEndMessage();

    public int bettingAmount;
    public Cards cards;

    public abstract boolean cardsSumCheck(Cards cardDeck);

    public abstract void getCardsMessage();

    public void startCardsSetting(Cards cardDeck) {
        addCard(cardDeck);
        addCard(cardDeck);
    }

    public void addCard(Cards cardDeck) {
        this.cards.addCard(cardDeck.chooseCard());
    }

    public List<String> getCards(){
        return cards.getCards();
    }
}
