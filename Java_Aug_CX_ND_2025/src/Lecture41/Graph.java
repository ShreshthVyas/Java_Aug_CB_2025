package Lecture41;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Graph {
	
	private HashMap<Integer, HashMap<Integer,Integer>> graph;
	
	public Graph(int v) {
		graph = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			graph.put(i, new HashMap<Integer, Integer>());
		}
	}
	public void AddVertice(int v) {
		graph.put(v, new HashMap<Integer, Integer>());
	}
	public void AddEdge(int v1, int v2,int w) {
		graph.get(v1).put(v2, w);
		graph.get(v2).put(v1, w);
	}
	public void RemoveEdge(int v1, int v2) {
		graph.get(v1).remove(v2);
		graph.get(v2).remove(v1);
	}
	public void RemoveVertice(int v) {
		
		for (Integer nbr : graph.get(v).keySet()) {
			graph.get(nbr).remove(v);
		}
		graph.remove(v);
	}
	
	public int countEdge() {
		int count =0;
		for (Integer v : graph.keySet()) {
			count+=  graph.get(v).size();
		}
		return count/2;
	}
	
	public void Display() {
		for (Integer v : graph.keySet()) {
			System.out.println(v + " ==>" + graph.get(v));
		}
	}
	
	public boolean hasPath(int src, int dest,HashSet<Integer> vis) {
		if(src ==dest) {
			return true;
		}
		vis.add(src);
		for(Integer nbrs : graph.get(src).keySet()) {
			if(vis.contains(nbrs)) {
				continue;
			}
			boolean ans = hasPath(nbrs, dest,vis);
			if(ans) {
				return ans;
			}
		}
		return false;
	}
	public boolean PrintAllPath(int src, int dest,HashSet<Integer> vis,String s) {
		if(src ==dest) {
			System.out.println(s);
			return true;
		}
		vis.add(src);
		for(Integer nbrs : graph.get(src).keySet()) {
			if(vis.contains(nbrs)) {
				continue;
			}
			PrintAllPath(nbrs, dest,vis, s + "=>" +nbrs);
			
		}
		vis.remove(src);
		return false;
	}
	
	public boolean bfs(int src, int dest) {
		if(src == dest) {
			return true;
		}
		Queue<Integer> q =  new LinkedList<>();
		HashSet<Integer> vis =  new HashSet<>();
		//1) Add Source
		q.add(src);
		
		while(!q.isEmpty()) {
			int rv = q.poll();
			
			if(rv == dest) {
				return true;
			}
			//check for visited
			if(vis.contains(rv)) {
				continue;
			}
			System.out.println(rv);
			//mark vis
			vis.add(rv);
			
			// Add all neighbours in queue
			for (Integer nbrs : graph.get(rv).keySet()) {
				if(!vis.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;
	}
	public boolean dfs(int src, int dest) {
		if(src == dest) {
			return true;
		}
		Stack<Integer> q =  new Stack<>();
		HashSet<Integer> vis =  new HashSet<>();
		//1) Add Source
		q.add(src);
		
		while(!q.isEmpty()) {
			int rv = q.pop();
			
			if(rv == dest) {
				return true;
			}
			//check for visited
			if(vis.contains(rv)) {
				continue;
			}
			System.out.println(rv);
			//mark vis
			vis.add(rv);
			
			// Add all neighbours in queue
			for (Integer nbrs : graph.get(rv).keySet()) {
				if(!vis.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;
	}
}
