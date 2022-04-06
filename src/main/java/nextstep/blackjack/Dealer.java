package nextstep.blackjack;

public class Dealer extends Player{

    @Override
    public void startCardsSetting(Cards cardDeck) {
        this.cards.addCard(cardDeck.chooseCard());
        this.cards.addCard(cardDeck.chooseCard());

        if(this.cards.getSum() <= 16){
            this.cards.addCard(cardDeck.chooseCard());
        }
    }
}
