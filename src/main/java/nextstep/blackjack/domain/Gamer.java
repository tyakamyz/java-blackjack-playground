package nextstep.blackjack.domain;

import nextstep.blackjack.ui.InputView;
import nextstep.blackjack.ui.ResultView;

import java.io.IOException;

public class Gamer extends Player {
    private final String name;

    public Gamer(String name){
        this.cards = new Cards();
        this.name = name;
        this.bettingAmount = 0;
    }

    @Override
    public boolean cardsSumCheck(Cards cardDeck) {
        if(this.cards.getSum() > 21){
            return true;
        }

        return false;
    }

    @Override
    public void getCardsMessage(){
        ResultView.getCardsMessage(this.name+"카드", getCards());
    }

    @Override
    public void getEndMessage() {
        ResultView.getCardsMessage(this.name+"카드", getCards(), this.cards.getSum());
    }

    public String getName(){
        return this.name;
    }

    public void setBettingAmount() throws IOException {
        this.bettingAmount = InputView.inputBettingAmount(this.name);
    }


}
