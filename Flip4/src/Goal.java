import aima.core.search.framework.problem.GoalTest;

public class Goal implements GoalTest{

	@Override
	public boolean isGoalState(Object state) {
		return ((State)state).isGoal();
	}

}
