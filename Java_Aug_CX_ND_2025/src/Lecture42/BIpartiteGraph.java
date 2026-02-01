package Lecture42;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BIpartiteGraph {

	public boolean isBipartite(int[][] graph) {
		Queue<pair> q =  new LinkedList<>();
		HashMap<Integer,Integer> vis = new HashMap<>();
		
		for (int i = 0; i < graph.length; i++) {
			if(vis.containsKey(i)) {
				continue;
			}
			q.add(new pair(i,0));
			while(!q.isEmpty()) {
				pair rv = q.poll();
				//check for visited
				if(vis.containsKey(rv.v)) {
					if(rv.d != vis.get(rv.v)) {//odd length
						return false;
					}
					continue;
				}
				//mark vis
				vis.put(rv.v, rv.d);
				
				// Add all neighbours in queue
				
				for (Integer nbr : graph[rv.v] ) {
					if(!vis.containsKey(nbr)) {
						q.add(new pair(nbr, rv.d+1));
					}
				}
//				for (int j = 0; j < arr.length; j++) {
//					int nbr = arr[i];
//				}
			}	
		}
		return true;
		
	}
	public class pair{
		int v;
		int d;
		pair(int v , int d){
			this.v = v;
			this.d = d;
		}
	}
}
