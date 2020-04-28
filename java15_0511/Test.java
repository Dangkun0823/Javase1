package java15_0511;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//扑克牌问题
class Card{
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
//        return "Card{" +
//                "rank='" + rank + '\'' +
//                ", suit='" + suit + '\'' +
//                '}';
        return "["+this.suit+this.rank+"]";
    }
}
public class Test {
    public static void main(String[] args) {
        List<Card> poker = buyPoker();
        //打乱List中的元素
        Collections.shuffle(poker);
//        System.out.println(poker);
        List<List<Card>> players=new ArrayList<>();
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                List<Card> player=players.get(j);
                Card card=poker.remove(11);
                player.add(card);
            }
        }

        for(int i=0;i<3;i++){
            System.out.println("玩家"+i+":"+players.get(i));
        }
    }

    private static List<Card> buyPoker() {
        List<Card> poker = new ArrayList<>();
        String[] suits = {"♥", "♠", "♣", "♦"};
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j < 11; j++) {
                   poker.add(new Card(""+j,suits[i]));
            }
            poker.add(new Card("J",suits[i]));
            poker.add(new Card("Q",suits[i]));
            poker.add(new Card("K",suits[i]));
            poker.add(new Card("A",suits[i]));
        }
        return poker;
    }
}
