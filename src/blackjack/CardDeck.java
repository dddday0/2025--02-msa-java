package blackjack;

public class CardDeck {
    //Card 객체 주소값 52개를 담을 수 있어야 합니다.
    private Card[] cards = new Card[52];
    private String[] patterns = { "스페이드", "하트", "클로버", "다이아"};
    private int drawIdx =0; // 외부로 카드를 준 idx 관리

    //CardDeck을 기본생성자로 호출만 하여도
    // Card 객체 52개를 생성하여 cards가 가리키는
    // 배열에 순차적으로 저장(대입)한다.
    // 가능하면 무늬별로 다른 denomination 값이
    // 저장되었으면 한다.

    public CardDeck() {
        init();
        shuffle();
    }

    public void print(){ // 검증용
        for(int i=0; i< cards.length; i++){
            Card c = cards[i];
            if( c == null) {
                System.out.println("null");
            } else {
                System.out.printf("%s - %s\n", c.getPattern(), c.getDenomination());
            }
        }
    }

    private void init() {
        int idx = 0;
        for(int i=0; i<patterns.length; i++) { //4
            String pattern = patterns[i];
            for(int d=1; d<=13; d++) { //13
                //정수 > 문자열
                String denomination = null;
                switch(d) {
                    case 1: denomination = "A"; break;
                    case 11: denomination = "J"; break;
                    case 12: denomination = "Q"; break;
                    case 13: denomination = "K"; break;
                    default: denomination = String.valueOf(d);
                }
                Card c = new Card(pattern, denomination);
                cards[idx++] = c;
            }
        }

//        for(int i=0; i<cards.length; i++) {
//            Card c = cards[i];
//            System.out.printf("%s - %s\n", c.getPattern(), c.getDenomination());
//        }
    }
    private void shuffle(){
        //cards 길이만큼 52번 도는 for문 세팅
        for(int i=0; i< cards.length; i++){
            int randomIdx = (int)(Math.random()* cards.length); // 0~51 랜덤값 나올 수 있도록.

            // i방과 randomIdx 방의 값을 서로 바꾼다.
            Card temp = cards[i];
            cards[randomIdx] = cards[i];
            cards[i] = temp;

        }
    }



    public Card draw(){
        if(drawIdx > 51) { return null;} // 예외처리, 안전장치,
        //cards의 방에 들어 있는 card 주소값을 순차적으로 리턴해주며, 리턴한 방은 null로 바꾼다.
        Card temp = cards[drawIdx];
        cards[drawIdx++] = null;
        return temp;
    }
}


