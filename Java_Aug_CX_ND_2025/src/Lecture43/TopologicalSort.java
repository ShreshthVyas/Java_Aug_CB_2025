package Lecture43;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {
	
private HashMap<Integer, HashSet<Integer>> graph;
	
	public TopologicalSort(int v) {
		graph = new HashMap<>();
		for (int i = 0; i < v; i++) {
			graph.put(i, new HashSet<Integer>());
		}
	}
	public void AddVertice(int v) {
		graph.put(v, new HashSet<Integer>());
	}
	public void AddEdge(int v1, int v2) {
		graph.get(v1).add(v2);
//		graph.get(v2).put(v1, w);
	}
	public void RemoveEdge(int v1, int v2) {
		graph.get(v1).remove(v2);
//		graph.get(v2).remove(v1);
	}
	public void RemoveVertice(int v) {
		
		for (Integer nbr : graph.get(v)) {
			graph.get(nbr).remove(v);
		}
		graph.remove(v);
	}
	
	public void Display() {
		for (Integer v : graph.keySet()) {
			System.out.println(v + " ==>" + graph.get(v));
		}
	}
	
	public int[] getIndegree() {
		int v = graph.size();
		int arr[] = new int[v];
		
		for (int v1 : graph.keySet()) {
			for (int v2 : graph.get(v1)) {
				arr[v2]++;
			}
		}
		return arr;
	}
	
	public void TopoSort() {
		int in[] = getIndegree();
		Queue<Integer> q =  new LinkedList<>();
		
		for (int i = 0; i < in.length; i++) {
			if(in[i] == 0) {
				q.offer(i);
			}
		}
		
		while(!q.isEmpty()) {
			int rv  = q.poll();
			System.out.print(rv+" ");
			
			for (Integer nbrs : graph.get(rv)) {
				in[nbrs]--;
				if(in[nbrs] == 0) {
					q.offer(nbrs);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopologicalSort g =  new TopologicalSort(6);
		g.AddEdge(1,2);
		g.AddEdge(3,1);
		g.AddEdge(3,5);
		g.AddEdge(5,0);
		g.AddEdge(4,0);
		g.AddEdge(4,2);
		g.TopoSort();
		
	}

}
