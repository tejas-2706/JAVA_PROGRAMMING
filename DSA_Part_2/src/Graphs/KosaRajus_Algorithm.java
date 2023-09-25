package Graphs;

import java.util.ArrayList;
import java.util.Stack;

import Graphs.Topological_Sorting_using_DFS_BFS.Edge;

public class KosaRajus_Algorithm {
	static class Edge{
		int src;
		int des;
		public Edge(int s, int d) {
			this.src = s;
			this.des = d;
		}
	}
	public static void createGraph(ArrayList<Edge>[] graph) {
		for(int i=0; i<graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		
		graph[0].add(new Edge(0,2));
		graph[0].add(new Edge(0,3));
		
		graph[1].add(new Edge(1,0));
		
		graph[2].add(new Edge(2,1));

		graph[3].add(new Edge(3,4));

		
	}
	public static void topsort(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> s) {
		vis[curr] = true;
		
		for(int i=0; i<graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if(!vis[e.des]) {
				topsort(graph, e.des, vis, s);
			}
		}
		s.push(curr);
	}
	public static void DFS(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
		vis[curr] = true;
		System.out.print(curr+" ");
		for(int i=0; i<graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if(!vis[e.des]) {
				DFS(graph,e.des,vis);
			}
		}
	}
	public static void kosaraju(ArrayList<Edge> graph[],int V) {
//		step 1 
		Stack<Integer> s = new Stack<>();
		boolean vis[] = new boolean[V];
		for(int i=0; i<V; i++) {
			if(!vis[i]) {
				topsort(graph, i, vis, s);
			}
		}
//		step 2
		ArrayList<Edge>transpose[] = new ArrayList[V];
		for(int i=0; i<graph.length; i++) {
			vis[i] = false;
			transpose[i] = new ArrayList<Edge>();
		}
	    for(int i=0; i<V; i++) {
	    	for(int j=0; j<graph[i].size(); j++) {
	    		Edge e = graph[i].get(j);
	    		transpose[e.des].add(new Edge(e.des,e.src)); // reverse
	    	}
	    }
	    
//	    step 3
	    while(!s.isEmpty()) {
	    	int curr = s.pop();
	    	if(!vis[curr]) {
	    		System.out.print("SCC -> ");
	    		DFS(transpose, curr, vis);//scc components
	    		System.out.println();
	    	}
	    }
	}
	public static void main(String[] args) {
		int V = 5;
		ArrayList<Edge> graph [] = new ArrayList[V];
        createGraph(graph);
        kosaraju(graph, V);
	}
}
