public class Reverse extends Card{
	public Reverse(String color, Game game){
		super(color,game);
	}
	public boolean play(){
		if(!super.isValid(this))
			return false;
		
		super.game().changeDirection();
		super.game().deck().add(this);
		return true;
	}
}