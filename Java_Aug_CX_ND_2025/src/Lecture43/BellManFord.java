package Lecture43;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class BellManFord {

private HashMap<Integer, HashMap<Integer,Integer>> graph;
	
	public BellManFord(int v) {
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
//		graph.get(v2).put(v1, w);
	}
	public void RemoveEdge(int v1, int v2) {
		graph.get(v1).remove(v2);
//		graph.get(v2).remove(v1);
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
	
	public class edgepair{
		int v1;
		int v2;
		int c;
		
		public edgepair(int v1, int v2, int c) {
			this.v1 = v1;
			this.v2  =v2;
			this.c = c;
		}
		
		public String toString() {
			return v1 + " , " + v2 + " , " + c;
		}
	}
	
	public ArrayList<edgepair> getedges(){
		ArrayList<edgepair> list =  new ArrayList<>();
		for (int v1 : graph.keySet()) {
			for (int v2 : graph.get(v1).keySet()) {
				int c = graph.get(v1).get(v2);
				list.add(new edgepair(v1, v2, c));
			}
		}
		return list;
	}
	
	
	public void BMF() {
		ArrayList<edgepair> list = getedges();
		int v = graph.size();
		int arr[] =  new int[v+1];
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = 9999999;//Avoid MAX_VAL to prevent overflow
		}
		
		for (int i = 1; i <=v; i++) {// v-1 times relax
			for (edgepair e : list) {
				//System.out.println(e);
				if(i == v && arr[e.v2]> arr[e.v1] + e.c) {// -ve Cycle 
					System.out.println("-ve Cycle");
					return;
				}
				if(arr[e.v2]> arr[e.v1] + e.c) {// relax 
					arr[e.v2] =arr[e.v1] + e.c;
				}
			}
			//System.out.println(Arrays.toString(arr));
		}
		
		for (int i = 1; i <=v; i++) {
			System.out.println(i + " ==> " + arr[i]);
		}
	}
	
	public static void main(String[] args) {
		BellManFord g =  new BellManFord(5);
		g.AddEdge(1, 2, -2);
		g.AddEdge(1, 3, 2);
		g.AddEdge(3, 4, 3);
		g.AddEdge(4, 5, 6);
		g.AddEdge(2, 5, 12);
		g.AddEdge(1, 4, -1);
		
//		BellManFord g =  new BellManFord(3);
//		g.AddEdge(1, 2, -1);
//		g.AddEdge(2, 3, -3);
//		g.AddEdge(3, 1, -2);
		
		g.BMF();
		
	}

}
