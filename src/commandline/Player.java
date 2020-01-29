package commandline;

public class Player {
	private int type;// AI(0) or human(1)
	private String name;//�������
	private Card[] deck;//��ҵĿ���
	private Card hand;//��ҵ�����
	private int numOfCards;
	public Player(String name,int type) {//constructor
		this.name=name;
		this.type=type;
		deck=new Card[50];
		numOfCards=0;
	}
	
	public boolean isAlive() {
		return numOfCards>0;
	}
	
	public void gainCard(Card c) {//��һ���Ƽ������deck
		deck[numOfCards++]=c;
	}
	public void drawCard() {//��deck�ĵ�һ���Ƶ�hand
		hand=deck[0];
		for(int i=0;i<numOfCards-1;i++) {
			deck[i]=deck[i+1];
		}
		numOfCards--;
	}
	public int getNumOfCards() {
		return numOfCards;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getType() {//getters
		return type;
	}
	public String getName() {
		return name;
	}
	public Card[] getDeck() {
		return deck;
	}
	public Card getHand() {
		return hand;
	}
}
