public abstract class Card implements Playable {
private Game game;
private String color;

public Card(String color, Game game){
	this.color=color;
	this.game=game;
}

public String color(){
	return this.color;
}
public String toString(){
	return game+", "+color;
}
public boolean isValid(Card c){
	return (c.color.equals("black") || c.color.equals(this.game().deck().current().color()));
}
public abstract boolean play();
public boolean equalsColor(Card other){
	return this.color.equals(other.color());
}
public Game game(){
	return this.game;
}

}