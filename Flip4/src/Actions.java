import aima.core.agent.Action;

public class Actions implements Action {

	private int move;
	
	public static final int ONE = 1;
	public static final int TWO = 2;
	public static final int THREE = 3;
	public static final int FOUR = 4;
	public static final int FIVE = 5;
	public static final int SIX = 6;
	public static final int SEVEN = 7;
	public static final int EIGHT = 8;
	public static final int NINE = 9;
	
	public int getMove() {
		return move;
	}
	
	protected Actions(int move) {
		super();
		this.move = move;
	}
	
	@Override
	public boolean isNoOp() {
		// TODO Auto-generated method stub
		return false;
	}

}
