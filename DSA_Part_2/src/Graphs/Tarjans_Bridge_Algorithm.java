package Graphs;

import java.util.ArrayList;

import Graphs.KosaRajus_Algorithm.Edge;

public class Tarjans_Bridge_Algorithm {
	
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
	
	public static void DFS(ArrayList<Edge>[] graph, int curr, int par,int dt[], int low[], boolean vis[],int time) {
		vis[curr] = true;
		dt[curr] = low[curr] = ++time;
		for(int i=0; i<graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			int neigh = e.des;
			if(neigh == par) {
				continue;
			}
			else if(!vis[neigh]) {
				DFS(graph, neigh, curr, dt, low, vis, time);
			    low[curr] = Math.min(low[curr], low[neigh]);
			    if(dt[curr] < low[neigh]) {
			    	System.out.print("Bridge : "+curr+"-----"+neigh);
			    	System.out.println();
			    }
			}
			else {
				low[curr] = Math.min(low[curr], dt[neigh]);
			}
		}
	}
	
	public static void tarjanBridge(ArrayList<Edge>[] graph, int V) {
		int dt[] = new int [V];
		int low[] = new int [V];
		int time = 0;
		boolean vis[] = new boolean[V];
		
		for(int i=0; i<V; i++) {
			if(!vis[i]) {
				DFS(graph, i, -1, dt, low, vis, time);
			}
		}
	}
	public static void main(String[] args) {
		int V = 5;
		ArrayList<Edge> graph [] = new ArrayList[V];
        createGraph(graph);
        tarjanBridge(graph, V);
	}
}
