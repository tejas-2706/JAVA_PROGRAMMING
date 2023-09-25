package Graphs;

import java.util.*;

public class Topological_Sorting_using_DFS_BFS {
	static class Edge{
		int src;
		int des;
		public Edge(int s, int d) {
			this.src = s;
			this.des = d;
		}
	}
	public static void createGraph(ArrayList<Edge>[] graph, int V) {
		for(int i=0; i<V; i++) {
			graph[i] = new ArrayList<>();
		}
		
		graph[0].add(new Edge(0,3));
		graph[2].add(new Edge(2,3));
		
		graph[3].add(new Edge(3,1));
		
		graph[4].add(new Edge(4,0));
		graph[4].add(new Edge(4,1));

		graph[5].add(new Edge(5,0));
		graph[5].add(new Edge(5,2));

		
	}
	
	public static void topSort(ArrayList<Edge>[] graph) {
		boolean vis[] = new boolean[graph.length];
		Stack<Integer> s = new Stack<>();
		
		for(int i=0; i<graph.length; i++) {
			if(!vis[i]) {
				topSortUtil(graph,i,vis,s); // modified dfs
			}
		}
		while(!s.isEmpty()) {
			System.out.print(s.pop()+" ");
		}
	}
//	using DFS
	public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], Stack<Integer> s) {
		vis[curr] = true;
		
		for(int i=0; i<graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if(!vis[e.des]) { // neighbor
				topSortUtil(graph, e.des, vis, s);
			}
		}
		s.push(curr);
	}
	public static void calcIndeg(ArrayList<Edge> graph[], int indeg[]) {
		for(int i=0; i<graph.length; i++) {
			int v = i;
			for(int j=0; j<graph[v].size(); j++) {
				Edge e = graph[v].get(j);
				indeg[e.des]++;
			}
		}
	}
	public static void topSortBFS(ArrayList<Edge> graph[]) {
		int indeg[] = new int[graph.length];
		calcIndeg(graph,indeg);
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i=0; i<indeg.length; i++) {
			if(indeg[i]==0) {
				q.add(i);
			}
//			bfs
			while(!q.isEmpty()) {
				int curr = q.remove();
				System.out.print(curr+" ");
				for(int j=0; j<graph[curr].size(); j++) {
					Edge e = graph[curr].get(j);
					indeg[e.des]--;
					if(indeg[e.des] == 0) {
						q.add(e.des);
					}
				}
			}
		}
		System.out.println();
	}
	
	public static void PrintAllPath(ArrayList<Edge> graph[],int src, int des, String path) {
		if (src == des) {
			System.out.print(path+des);
			return;
		}
		for(int i=0; i<graph[src].size(); i++) {
			Edge e = graph[src].get(i);
			PrintAllPath(graph, e.des, des, path+src);
		}
	}
	public static void main(String[] args) {
		int V = 6;
		ArrayList<Edge>[] graph = new ArrayList[V];
		
		createGraph(graph,V);
		
		System.out.print("top sort = ");
		topSort(graph); // O(V+E)
		System.out.println();
		System.out.print("top sort = ");

		topSortBFS(graph);
		
		int src = 5, des = 1;
		PrintAllPath(graph, src, des, "");
	}
}
