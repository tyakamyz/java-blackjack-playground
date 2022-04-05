package nextstep.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Cards {
    List<Card> decks;

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

    private void deleteCard(int index){
        decks.remove(index);
    }
}
