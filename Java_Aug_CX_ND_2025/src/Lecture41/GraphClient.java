package Lecture41;

import java.util.HashSet;

public class GraphClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
//		g.AddVertice(8);
		g.AddEdge(1, 2, 10);
		g.AddEdge(1, 3, 10);
		g.AddEdge(2, 4, 10);
		g.AddEdge(3, 4, 10);
		g.AddEdge(2, 5, 10);
		g.AddEdge(5, 6, 10);
		g.AddEdge(5, 7, 10);
		g.AddEdge(6, 7, 10);
		g.Display();
//		boolean ans = g.hasPath(1, 9, new HashSet<Integer>());
//		System.out.println(ans);
//		
//		g.PrintAllPath(1, 6, new HashSet<Integer>(),1+ "");
		System.out.println(g.bfs(1, 9));
		System.out.println(g.dfs(1, 9));
	}

}
