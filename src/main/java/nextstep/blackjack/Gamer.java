package nextstep.blackjack;

public class Gamer extends Player {
    public int bettingAmount;

    @Override
    public void startCardsSetting(Cards cardDeck) {
        this.cards.addCard(cardDeck.chooseCard());
        this.cards.addCard(cardDeck.chooseCard());
    }
}
