import java.util.HashSet;
import java.util.Set;

import aima.core.agent.Action;
import aima.core.search.framework.problem.ActionsFunction;

public class ActionFunction implements ActionsFunction {

	@Override
	public Set<Action> actions(Object o) {
		Set<Action> actionSet = new HashSet<>();
		State s = (State)o;
		
		if(s.one()) {
			actionSet.add(new Actions(Actions.ONE));
		}
		
		if(s.two()) {
			actionSet.add(new Actions(Actions.TWO));
		}
		
		if(s.three()) {
			actionSet.add(new Actions(Actions.THREE));
		}
		
		if(s.four()) {
			actionSet.add(new Actions(Actions.FOUR));
		}
		
		if(s.five()) {
			actionSet.add(new Actions(Actions.FIVE));
		}
		
		if(s.six()) {
			actionSet.add(new Actions(Actions.SIX));
		}
		
		if(s.seven()) {
			actionSet.add(new Actions(Actions.SEVEN));
		}
		
		if(s.eight()) {
			actionSet.add(new Actions(Actions.EIGHT));
		}
		
		if(s.nine()) {
			actionSet.add(new Actions(Actions.NINE));
		}
		
		return actionSet;
	}

}
