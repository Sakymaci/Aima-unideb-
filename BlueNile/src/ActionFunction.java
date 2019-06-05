import java.util.HashSet;
import java.util.Set;

import aima.core.agent.Action;
import aima.core.search.framework.problem.ActionsFunction;

public class ActionFunction implements ActionsFunction {

	@Override
	public Set<Action> actions(Object o) {
		Set<Action> actionSet = new HashSet<>();
		State s = (State)o;
		
		if(s.canUpLeft()) {
			actionSet.add(new Actions(Actions.UPLEFT));
		}
		
		if(s.canUpRight()) {
			actionSet.add(new Actions(Actions.UPRIGHT));
		}
		
		if(s.canLeft()) {
			actionSet.add(new Actions(Actions.LEFT));
		}
		
		if(s.canRight()) {
			actionSet.add(new Actions(Actions.RIGHT));
		}
		
		if(s.canDownLeft()) {
			actionSet.add(new Actions(Actions.DOWNLEFT));
		}
		
		if(s.canDownRight()) {
			actionSet.add(new Actions(Actions.DOWNRIGHT));
		}
		return actionSet;
	}

}
