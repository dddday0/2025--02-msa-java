package blackjack;

public class Rule {
    private final static int BLACKJACK_SCORE = 21;
    // 2~10은 숫자 그대로, K/Q/J 는 10점, A는 1점
    // 카드들의 모든 점수를 더하고, 더한 점수를 리턴.
    public static int calcScore(Card[] cards) {
        int totalScore = 0;
        for (Card card : cards) {
            String denomination = card.getDenomination();
            // switch 표현식
            int score = switch (denomination) {
                case "A" -> 1;
                case "J", "Q", "K" -> 10;
                default -> Integer.parseInt(denomination);
            };
            totalScore += score;
        }
        return totalScore;
    }

    public static void whoIsWinner(Dealer dealer, Gamer gamer) {
        Card[] dealerCards = dealer.openCard();
        Card[] gamerCards = gamer.openCard();
        int dealerScore = calcScore(dealerCards);
        int gamerScore =  calcScore(gamerCards);


        /*  둘의 점수가 같다 > 무승부
        둘다 21점 초과 > 무승부
        딜러가 21점 초과, 게이머 21점 이하 > 게이머 승
        게이머가 21점 초과, 딜러가 21점 이하 > 딜러 승
        둘 다 21점 초과 X, 게이머가 딜러보다 점수 높으면 > 게이머 승
        ...
        */
        if (dealerScore == gamerScore || dealerScore > BLACKJACK_SCORE && gamerScore > BLACKJACK_SCORE) {
            System.out.println("무승부");
        } else if (dealerScore > BLACKJACK_SCORE || gamerScore <=BLACKJACK_SCORE && gamerScore > dealerScore) {
            System.out.println("게이머 승");
        } else {
            System.out.println("딜러 승");
        }
    }

}
