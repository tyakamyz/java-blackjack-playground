package nextstep.blackjack.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class InputView {
    private static final String INPUT_GAMER = "게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)";
    private static final String INPUT_BETTING_AMOUNT = "의 배팅 금액은?";
    private static final String INPUT_ADD_CARD_FLAG = "는(은) 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)";

    private static final Map<String,Boolean> flagMap = new HashMap<>();
    static {
        flagMap.put("y", true);
        flagMap.put("n", false);
    }

    /* 참가자 이름 입력 */
    public static String inputGamer() throws IOException {
        System.out.println(INPUT_GAMER);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        return br.readLine();
    }

    /* 참가자 배팅 금액 입력 */
    public static int inputBettingAmount(String name) throws IOException {
        System.out.println(name + INPUT_BETTING_AMOUNT);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        return Integer.parseInt(br.readLine());
    }

    /* 참가자 배팅 금액 입력 */
    public static boolean inputAddCardFlag(String name) throws IOException {
        System.out.println(name + INPUT_ADD_CARD_FLAG);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        return flagMap.get(br.readLine().toLowerCase(Locale.ROOT));
    }
}
