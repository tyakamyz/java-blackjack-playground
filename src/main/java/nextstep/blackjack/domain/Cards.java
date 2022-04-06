package nextstep.blackjack.domain;

import java.util.ArrayList;
import java.util.List;

public class Cards {
    public List<Card> decks;

    public Cards(){
        this.decks = new ArrayList<>();
    }

    public void createCardDecks(){
        for(Card.Type type:Card.Type.values()){
            createCardDeck(type);
        }
    }

    private void createCardDeck(Card.Type type) {
        for(int i=Card.MIN_COUNT; i<=Card.MAX_COUNT; i++){
            this.decks.add(new Card(type, i));
        }
    }

    public Card chooseCard(){
        int randomNumber = (int) (Math.random() * (this.decks.size()));
        Card chooseCard = decks.get(randomNumber);

        deleteCard(randomNumber);

        return chooseCard;
    }

    public void addCard(Card card){
        decks.add(card);
    }

    private void deleteCard(int index){
        decks.remove(index);
    }

    public int getSum() {
        /* Ace 카드 제외하고 계산 */
        int result = this.decks.stream().mapToInt(card -> card.number).filter(n -> n != 1).sum();

        /* Ace 카드 일 경우 1 또는 11로 점수 계산 */
        if(this.decks.stream().mapToInt(card -> card.number).anyMatch(n -> n == 1)){
            result = getSumAceCard(result);
        }

        return result;
    }

    private int getSumAceCard(int result) {
        if (result > 10) {
            return result + 1;
        }

        return result + 11;
    }

    public List<String> getCards() {
        List<String> cards = new ArrayList<>();

        for(Card card : decks){
            cards.add(card.getCard());
        }

        return cards;
    }
}
