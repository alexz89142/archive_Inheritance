public class Draw2 extends Card {
public Draw2(String color, Game game){
	super(color,game);
}
public boolean play(){
	if(!super.isValid(this))
		return false;
	
	super.game().deck().add(this);
	Player newPlayer = super.game().next();
	newPlayer.add(super.game().deck().draw());
	newPlayer.add(super.game().deck().draw());
	return true;
}
}