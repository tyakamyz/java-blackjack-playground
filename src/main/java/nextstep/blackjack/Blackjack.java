package nextstep.blackjack;

import nextstep.blackjack.domain.Cards;
import nextstep.blackjack.domain.Dealer;
import nextstep.blackjack.domain.Gamer;
import nextstep.blackjack.domain.Gamers;
import nextstep.blackjack.ui.InputView;

import java.io.IOException;

public class Blackjack {
    public static void main(String[] args) throws IOException {

        /* 참가자 입력 */
        Gamers gamers = new Gamers();
        String inputGamesString = InputView.inputGamer();
        for(String inputGamer : inputGamesString.split(",")){
            gamers.addGamer(new Gamer(inputGamer));
        }
        System.out.println();

        /* 딜러 생성 */
        Dealer dealer = new Dealer();

        /* 배팅 금액 입력 */
        gamers.setBettingAmount();

        /* 카드 덱 생성 */
        Cards cardDeck = new Cards();
        cardDeck.createCardDecks();

        /* 최초 카드 배분 */
        gamers.startCardsSetting(cardDeck);
        dealer.startCardsSetting(cardDeck);

        /* 최초 카드 배분 결과 */
        gamers.getCardsMessage();
        dealer.getCardsMessage();
        System.out.println();

        if(!gamers.addCardRetrunEndFlag(cardDeck)){
            /* 딜러 카드 배분 */
            System.out.println();
            dealer.cardsSumCheck(cardDeck);
        }
        System.out.println();

        /* 최종 점수 계산 */
        //finalScore()

        /* 게임 최종 메세지 */
        gameEndMessage(gamers, dealer);

    }

    private static void gameEndMessage(Gamers gamers, Dealer dealer) {
        gamers.getEndMessage();
        dealer.getEndMessage();


    }

}
