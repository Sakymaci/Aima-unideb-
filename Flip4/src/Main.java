import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import aima.core.agent.Action;
import aima.core.search.framework.SearchAgent;
import aima.core.search.framework.SearchForActions;
import aima.core.search.framework.problem.Problem;
import aima.core.search.framework.qsearch.GraphSearch;
import aima.core.search.uninformed.BreadthFirstSearch;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please write down the state! Spaces between. (black = 0, white = 1");
		System.out.println("Example: 1 0 1");
		boolean[][] tmp = new boolean[3][3];
		for(int i = 0; i < 3 ; i++) {
			String s = br.readLine();
			String[] tokens = s.split(" ");
			for(int j = 0; j < 3; j++)
			{
				if(tokens[j].equals("1"))
					tmp[i][j] = true;
				else
					tmp[i][j] = false;

			}
		}
		Position asd = new Position(tmp);
		State start = new State(asd);
		for(int i = 0; i < 3 ; i++) {
			for(int j = 0; j < 3; j++)
			{
				tmp[i][j] = true;
			}
		}
		Position end = new Position(tmp);
		State.setFinish(end);
		ActionFunction actFunc = new ActionFunction();
		Result resultFunc = new Result();
		Goal goal = new Goal();
		Problem p = new Problem(start, actFunc, resultFunc, goal); 
		BreadthFirstSearch search = new BreadthFirstSearch();
		SearchAgent agent = new SearchAgent(p, (SearchForActions)search);
		List<Action> listAct = new LinkedList<Action>();
		listAct = agent.getActions();
		for(Action action : listAct) {
			Actions act = (Actions)action;
			System.out.print(""+act.getMove()+", ");
		}
	}
}