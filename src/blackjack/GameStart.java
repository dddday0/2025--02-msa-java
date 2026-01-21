package blackjack;

public class GameStart {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();


        //딜러와 게이머는 순차적으로 카드를 하나씩 뽑아 각자 2개의 카드를 소지한다.
        Card c1 = cd.draw();
        gamer.receiveCard(c1);
        dealer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());

        // 딜러가 가지고 있는 카드의 점수가 16점 이하면 카드 한장을 더 소지한다.
        if(dealer.needmoreCards()) {
            dealer.receiveCard(cd.draw());
        }

        System.out.println("-- 딜러 --");
        dealer.showYourCards();
        System.out.println("-- 게이머 --");
        gamer.showYourCards();
        // 게이머가 추가로 오픈


        // 비교, 누가 이겼습니까?
        Rule.whoIsWinner(dealer, gamer);
    }
}
