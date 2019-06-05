import aima.core.agent.Action;
import aima.core.search.framework.problem.ResultFunction;

public class Result  implements ResultFunction{

	@Override
	public Object result(Object o, Action a) {
		State s = (State) o;
		Actions act = (Actions) a;
		
		if(act.getMove()==Actions.UPRIGHT) {
			return s.MoveUpRight();					
		}
		
		if(act.getMove()==Actions.UPLEFT) {
			return s.MoveUpLeft();					
		}
		
		if(act.getMove()==Actions.RIGHT) {
			return s.MoveRight();					
		}
		
		if(act.getMove()==Actions.LEFT) {
			return s.MoveLeft();					
		}
		
		if(act.getMove()==Actions.DOWNRIGHT) {
			return s.MoveDownRight();					
		}
		
		if(act.getMove()==Actions.DOWNLEFT) {
			return s.MoveDownLeft();					
		}
		return null;
	}

}
