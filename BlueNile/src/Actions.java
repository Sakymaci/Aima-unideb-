import aima.core.agent.Action;

public class Actions implements Action{
private int move;
	
	public static final int DOWNRIGHT = 0;
	public static final int DOWNLEFT = 1;
	public static final int RIGHT = 2;
	public static final int LEFT = 3;
	public static final int UPRIGHT = 4;
	public static final int UPLEFT = 5;
	
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
