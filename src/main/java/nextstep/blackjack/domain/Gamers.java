package nextstep.blackjack.domain;

import nextstep.blackjack.ui.InputView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Gamers {
    private List<Gamer> gamers;

    public Gamers(){
        gamers = new ArrayList<>();
    }

    public void addGamer(Gamer gamer){
        this.gamers.add(gamer);
    }

    public void setBettingAmount() throws IOException {
        for(Gamer gamer : gamers){
            gamer.setBettingAmount();
            System.out.println();
        }
    }

    public void startCardsSetting(Cards cardDeck) {
        for(Gamer gamer : gamers){
            gamer.startCardsSetting(cardDeck);
        }
    }

    public void getCardsMessage() {
        for(Gamer gamer : gamers){
            gamer.getCardsMessage();
        }
    }

    public void getEndMessage() {
        for(Gamer gamer : gamers){
            gamer.getEndMessage();
        }
    }

    public boolean cardsSumCheck(Cards cardDeck) {
        for(Gamer gamer : gamers){
            if (cardSumCheck(cardDeck, gamer)) return true;
        }
        return false;
    }

    private boolean cardSumCheck(Cards cardDeck, Gamer gamer) {
        return gamer.cardsSumCheck(cardDeck);
    }

    public boolean addCardRetrunEndFlag(Cards cardDeck) throws IOException {
        for(Gamer gamer : gamers){
            while (true){
                /* 카드 재 배분 전 확인 */
                if (cardSumCheck(cardDeck, gamer)) return true;

                if (continueGameFlag(gamer)) break;
                gamer.addCard(cardDeck);
                gamer.getCardsMessage();
            }
        }

        return false;
    }

    private boolean continueGameFlag(Gamer gamer) throws IOException {
        return !InputView.inputAddCardFlag(gamer.getName());
    }
}
