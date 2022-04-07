package nextstep.blackjack.ui;

import java.util.List;

public class ResultView {
    private static final String DEALER_ADD_CARD_RESULT = "딜러는 16이하라 한장의 카드를 더 받았습니다.";

    public static void dealerAddCardResultMessage(){
        System.out.println(DEALER_ADD_CARD_RESULT);
    }

    public static void getCardsMessage(String name, List<String> cards) {
        System.out.println(name + ": " + cards.toString().replaceAll("\\[","").replaceAll("\\]",""));
    }

    public static void getCardsMessage(String name, List<String> cards, int result) {
        System.out.println(name + ": " + cards.toString().replaceAll("\\[","").replaceAll("\\]","") + " - 결과: " + result);
    }
}
