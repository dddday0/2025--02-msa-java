package blackjack;

public class BlackJackMain {
    public static void main(String[] args) {
        System.out.println("------최초------");
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        dealer.needmoreCards();

        Card c1 = cd.draw();
        gamer.receiveCard(c1);

        Card[] gamerCards = gamer.openCard();
        for(int i=0; i<gamerCards.length; i++){
            System.out.println(gamerCards[i]);
        }

        // 카드 받는 게 종료.
        Rule.whoIsWinner(dealer, gamer); // 동점, 딜러 승, 게이머 승
    }
}
