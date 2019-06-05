import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import aima.core.agent.Action;
import aima.core.search.framework.SearchAgent;
import aima.core.search.framework.SearchForActions;
import aima.core.search.framework.problem.Problem;
import aima.core.search.uninformed.IterativeDeepeningSearch;

public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("Please write the starting point: y x");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] tokens = s.split(" ");
		Position fin = new Position(7,5); // dunno how to see if done
		State.setFinish(fin);
		Position pos = new Position(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
		State start = new State(pos);
		ActionFunction actFunc = new ActionFunction();
		Result resultFunc = new Result();
		Goal goal = new Goal();
		Problem p = new Problem(start, actFunc, resultFunc, goal); 
		IterativeDeepeningSearch search = new IterativeDeepeningSearch();
		SearchAgent agent = new SearchAgent(p, (SearchForActions) search);
		List<Action> listAct = new LinkedList<Action>();
		listAct = agent.getActions();
		System.out.println(listAct.size());
		for(Action action : listAct) {
			Actions act = (Actions)action;
			System.out.print(""+act.getMove()+", ");
		}
	}
}
