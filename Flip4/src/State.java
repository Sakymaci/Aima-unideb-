
public class State {
	private Position game;
	private static Position finish;
	
	protected State(Position game) {
		super();
		this.game = game;
	}

	public static void setFinish(Position p) {
		finish = p;
	}
	
	public boolean isGoal() {
		return game.equals(finish);
	}
	
	public State ZeroZero() {
		return new State(game.zerozero());
	}
	public State ZeroOne() {
		return new State(game.zeroone());
	}
	public State ZeroTwo() {
		return new State(game.zerotwo());
	}
	public State OneZero() {
		return new State(game.onezero());
	}
	public State OneOne() {
		return new State(game.oneone());
	}
	public State OneTwo() {
		return new State(game.onetwo());
	}
	public State TwoZero() {
		return new State(game.twozero());
	}
	public State TwoOne() {
		return new State(game.twoone());
	}
	public State TwoTwo() {
		return new State(game.twotwo());
	}
	public boolean one() {
		Position newPos = game.zerozero();
		return !(game.close() < newPos.close());
	}
	public boolean two() {
		Position newPos = game.zeroone();
		return !(game.close() < newPos.close());
	}
	public boolean three() {
		Position newPos = game.zerotwo();
		return !(game.close() < newPos.close());
	}
	public boolean four() {
		Position newPos = game.onezero();
		return !(game.close() < newPos.close());
	}
	public boolean five() {
		Position newPos = game.oneone();
		return !(game.close() < newPos.close());
	}
	public boolean six() {
		Position newPos = game.onetwo();
		return !(game.close() < newPos.close());
	}
	public boolean seven() {
		Position newPos = game.twozero();
		return !(game.close() < newPos.close());
	}
	public boolean eight() {
		Position newPos = game.twoone();
		return !(game.close() < newPos.close());
	}
	public boolean nine() {
		Position newPos = game.twotwo();
		return !(game.close() < newPos.close());
	}
}
