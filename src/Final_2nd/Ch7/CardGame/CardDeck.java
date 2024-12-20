package Final_2nd.Ch7.CardGame;

public class CardDeck {
    private int card_count; // 남은 카드 수
    private Card[] deck = new Card[4 * Card.SIZE_OF_ONE_SUIT];
    // Invariant : deck[0], ..., deck[card_count-1]에 카드가 있다.

    /** CardDeck 카드 한 번 생성 */
    public CardDeck() {
        createDeck();
    }

    /** 주어진 무늬로 카드 13장 생성 */
    private void createSuit(String which_suit) {
        for (int i = 1; i <= Card.SIZE_OF_ONE_SUIT; i++) {
            deck[card_count] = new Card(which_suit, i);
            card_count += 1;
        }
    }

    private void createDeck() {
        createSuit(Card.SPADES);
        createSuit(Card.HEARTS);
        createSuit(Card.CLUBS);
        createSuit(Card.DIAMONDS);
    }

    /** 임의의 새 카드 한 장을 뽑아 줌
     * @return 카드 덱에서 임의로 한 장을 뽑아 리턴
     *         없으면 카드 1번을 새로 만들고 한 장을 뽑아 리턴
     */
    public Card newCard() {
        if (!this.moreCards())
            createDeck();
        int index = (int)(Math.random() * card_count);
        // 0.0 <= Math.random() < 1.0
        // 0.0 <= Math.random() * card_count < card_count
        Card card_to_deal = deck[index];
        for (int i = index + 1; i < card_count; i++)
            deck[i-1] = deck[i];
        card_count = card_count - 1;
        return card_to_deal;
    }

    public boolean moreCards() {
        return card_count > 0;
    }
}
