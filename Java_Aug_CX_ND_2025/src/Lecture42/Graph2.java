package Lecture42;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph2 {
	

private HashMap<Integer, HashMap<Integer,Integer>> graph;
	
	public Graph2(int v) {
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
	
	public void Display() {
		for (Integer v : graph.keySet()) {
			System.out.println(v + " ==>" + graph.get(v));
		}
	}
	
	public void BFT() {
		HashSet<Integer> vis =  new HashSet<>();
		Queue<Integer> q = new LinkedList<>();
		
		for (Integer src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			q.add(src);
			while(!q.isEmpty()) {
				int rv = q.poll();
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
		}
	}
	public void DFT() {
		HashSet<Integer> vis =  new HashSet<>();
		Stack<Integer> q = new Stack<>();
		
		for (Integer src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			q.add(src);
			while(!q.isEmpty()) {
				int rv = q.pop();
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
		}
	}
	
	public boolean isConnected() {
		HashSet<Integer> vis =  new HashSet<>();
		Queue<Integer> q = new LinkedList<>();
		int count =0;
		for (Integer src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			count++;
			q.add(src);
			while(!q.isEmpty()) {
				int rv = q.poll();
				//check for visited
				if(vis.contains(rv)) {
					continue;
				}
				
				//mark vis
				vis.add(rv);
				
				// Add all neighbours in queue
				for (Integer nbrs : graph.get(rv).keySet()) {
					if(!vis.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}	
		}
		System.out.println(count);
		return count ==1;
	}
	
	public boolean isCyclic() {
		HashSet<Integer> vis =  new HashSet<>();
		Queue<Integer> q = new LinkedList<>();
		
		for (Integer src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			q.add(src);
			while(!q.isEmpty()) {
				int rv = q.poll();
				//check for visited
				if(vis.contains(rv)) {// cyclic
					return true;
				}
				
				//mark vis
				vis.add(rv);
				
				// Add all neighbours in queue
				for (Integer nbrs : graph.get(rv).keySet()) {
					if(!vis.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}	
		}
		return false;
	}
	
	public boolean isTree() {
		HashSet<Integer> vis =  new HashSet<>();
		Queue<Integer> q = new LinkedList<>();
		int count = 0;
		for (Integer src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			count++;
			q.add(src);
			while(!q.isEmpty()) {
				int rv = q.poll();
				//check for visited
				if(vis.contains(rv)) {//cyclic
					return false;
				}
				
				//mark vis
				vis.add(rv);
				
				// Add all neighbours in queue
				for (Integer nbrs : graph.get(rv).keySet()) {
					if(!vis.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}	
		}
		return count<=1;// connected Or Diconnected
	}
	
	public static void main(String[] args) {
		Graph2 g =  new Graph2(8);
		g.AddEdge(1, 2, 0);
		g.AddEdge(1, 3, 0);
		g.AddEdge(2, 4, 0);
		g.AddEdge(3, 4, 0);
		g.AddEdge(5, 6, 0);
		g.AddEdge(6, 7, 0);
		g.AddEdge(5, 7, 0);
		
		g.BFT();
		System.out.println();
		g.DFT();
		
		System.out.println(g.isCyclic());
		System.out.println(g.isConnected());
		System.out.println(g.isTree());
	}

}
