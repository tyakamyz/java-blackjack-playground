package nextstep.blackjack.domain;

import nextstep.blackjack.ui.ResultView;

public class Dealer extends Player{

    public Dealer(){
        this.cards = new Cards();
        this.bettingAmount = 0;
    }

    @Override
    public void getCardsMessage(){
        ResultView.getCardsMessage("딜러", getCards());
    }

    @Override
    public void getEndMessage() {
        ResultView.getCardsMessage("딜러 카드", getCards(), this.cards.getSum());
    }

    @Override
    public boolean cardsSumCheck(Cards cardDeck){
        if(this.cards.getSum() > 21){
            return true;
        }

        if(this.cards.getSum() <= 16){
            ResultView.dealerAddCardResultMessage();
            this.cards.addCard(cardDeck.chooseCard());
        }

        return false;
    }
}
