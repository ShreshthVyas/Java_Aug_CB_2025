package Lecture43;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

import Lecture42.PrimsAlgo;
import Lecture42.PrimsAlgo.PrimsPair;

public class Djikstra {

private HashMap<Integer, HashMap<Integer,Integer>> graph;
	
	public Djikstra(int v) {
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
	
	public class DjikstraPair{
		int v;
		String path;
		int cost;
		
		public DjikstraPair(int v, String aqv, int cost) {
			this.v = v;
			this.path = aqv;
			this.cost = cost;
		}
		
		@Override
		public String toString() {
			return this.v + " via " + this.path + " @ " + this.cost;
		}
	}
	
	public void DjikstraAlgo() {
		PriorityQueue<DjikstraPair> pq =  new PriorityQueue<>(new Comparator<DjikstraPair>() {

			@Override
			public int compare(DjikstraPair o1, DjikstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost -o2.cost;
			}
		});

		HashSet<Integer> vis =  new HashSet<>();
		for (Integer src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			pq.add(new DjikstraPair(src,src+"",0));
			while(!pq.isEmpty()) {
				DjikstraPair rv = pq.remove();
				//check for visited
				if(vis.contains(rv.v)) {
					continue;
				}
				System.out.println(rv);
				//mark vis
				vis.add(rv.v);
				
				// Add all neighbours in queue
				for (Integer nbrs : graph.get(rv.v).keySet()) {
					if(!vis.contains(nbrs)) {
						int cost =  graph.get(rv.v).get(nbrs) + rv.cost;
						pq.add(new DjikstraPair(nbrs, rv.path+"=>"+ nbrs, cost));
//						
					}
				}
			}	
		}
	}
	
	public static void main(String[] args) {
		Djikstra g =  new Djikstra(7);
		g.AddEdge(1, 2, 1);
		g.AddEdge(1, 4, 60);
		g.AddEdge(2, 3, 2);
		g.AddEdge(3, 4, 8);
		g.AddEdge(5, 6, 20);
		g.AddEdge(6, 7, 4);
		g.AddEdge(5, 7, 1);
		g.AddEdge(2, 5, 14);
		
		g.DjikstraAlgo();
	}


}
