import java.util.HashSet;
import java.util.Set;

public class State {
	private Position pos;
	private static Position finish;
	private static Set<Position> wall = new HashSet<Position>();
	
	protected State(Position pos) {
		super();
		this.pos = pos;
	}
	
	public static void addWall(Position p) {
		wall.add(p);
	}
	public void addWall_last(Position p) {
		Position newPos = p.down_left();
		wall.add(newPos);
		newPos = p.down_left();
		wall.add(newPos);
		newPos = p.down_right();
		wall.add(newPos);
		newPos = p.left();
		wall.add(newPos);
		newPos = p.right();
		wall.add(newPos);
		newPos = p.up_left();
		wall.add(newPos);
		newPos = p.up_right();
		wall.add(newPos);
	}
	
	public boolean canDownLeft() {
		Position newPos = pos.down_left();
		return (newPos!=null && !wall.contains(newPos));
	}
	
	public boolean canDownRight() {
		Position newPos = pos.down_right();
		return (newPos!=null && !wall.contains(newPos));
	}
	
	public boolean canLeft() {
		Position newPos = pos.left();
		return (newPos!=null && !wall.contains(newPos));
	}
	
	public boolean canRight() {
		Position newPos = pos.right();
		return (newPos!=null && !wall.contains(newPos));
	}
	
	public boolean canUpLeft() {
		Position newPos = pos.up_left();
		return (newPos!=null && !wall.contains(newPos));
	}
	
	public boolean canUpRight() {
		Position newPos = pos.up_right();
		return (newPos!=null && !wall.contains(newPos));
	}
	
	public State MoveDownLeft() {
		return new State(pos.down_left());
	}
	
	public State MoveDownRight() {
		return new State(pos.down_right());
	}
	public State MoveLeft() {
		return new State(pos.left());
	}
	
	public State MoveRight() {
		return new State(pos.right());
	}
	public State MoveUpLeft() {
		return new State(pos.down_left());
	}
	
	public State MoveUpRight() {
		return new State(pos.down_right());
	}
	
	public boolean isGoal() {
		return pos.equals(finish);
	}

	public static void setFinish(Position fin) {
		finish = fin;		
	}
}
