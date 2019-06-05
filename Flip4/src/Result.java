import aima.core.agent.Action;
import aima.core.search.framework.problem.ResultFunction;

public class Result implements ResultFunction{

	@Override
	public Object result(Object o, Action a) {
		State s = (State) o;
		Actions act = (Actions) a;
		if(act.getMove()==Actions.ONE) {
			return s.one();					
		}
		
		if(act.getMove()==Actions.TWO) {
			return s.two();					
		}
		
		if(act.getMove()==Actions.THREE) {
			return s.three();					
		}
		
		if(act.getMove()==Actions.FOUR) {
			return s.four();					
		}
		
		if(act.getMove()==Actions.FIVE) {
			return s.five();					
		}
		
		if(act.getMove()==Actions.SIX) {
			return s.six();					
		}
		
		if(act.getMove()==Actions.SEVEN) {
			return s.seven();					
		}
		
		if(act.getMove()==Actions.EIGHT) {
			return s.eight();					
		}
		
		if(act.getMove()==Actions.NINE) {
			return s.nine();					
		}
		
		return null;
	}

}
