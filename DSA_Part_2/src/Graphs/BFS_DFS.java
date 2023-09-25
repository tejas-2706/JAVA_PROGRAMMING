package Graphs;

import java.util.*;

public class BFS_DFS {
	static class Edge{
		int src;
		int des;
		int wt;
		public Edge(int s, int d, int w) {
			this.src = s;
			this.des = d;
			this.wt = w;
		}
	}
	public static void creategraph(ArrayList<Edge>[] graph, int V) {
		for(int i=0; i<V; i++) {
			graph[i] = new ArrayList<>();
		}
		
//		0 - vertex
		graph[0].add(new Edge(0, 1, 1));
		graph[0].add(new Edge(0, 2, 1));
		
//		1 - vertex
		graph[1].add(new Edge(1, 0, 1));
//		graph[1].add(new Edge(1, 2, 1));
		graph[1].add(new Edge(1, 3, 1));
		
//		2 - vertex
		graph[2].add(new Edge(2, 0, 1));
//		graph[2].add(new Edge(2, 3, 1));
		graph[2].add(new Edge(2, 4, 1));

//		3 - vertex
		graph[3].add(new Edge(3, 1, 1));
		graph[3].add(new Edge(3, 4, 1));
		graph[3].add(new Edge(3, 5, 1));

//		4 - vertex
		graph[4].add(new Edge(4, 2, 1));
		graph[4].add(new Edge(4, 3, 1));
		graph[4].add(new Edge(4, 5, 1));

//		5 - vertex
		graph[5].add(new Edge(5, 3, 1));
		graph[5].add(new Edge(5, 4, 1));
		graph[5].add(new Edge(5, 6, 1));

//		6 - vertex
		graph[6].add(new Edge(6, 5, 1));

	}
	
	public static void BFS(ArrayList<Edge>[] graph) {
		boolean vis[] = new boolean[graph.length];
		for(int i=0; i<graph.length; i++) {
			if(!vis[i]) {
				BFSUtil(graph, vis);
			}
		}
	}
	public static void BFSUtil(ArrayList<Edge>[] graph, boolean vis[]) {//O(n) // O(V+E)
		Queue<Integer> q = new LinkedList<>();
//		boolean vis[] = new boolean[graph.length];
		q.add(0); //source = 0
		while(!q.isEmpty()) {
			int curr = q.remove();
			if(!vis[curr]) {// visit curr if false
//				then visit curr
				System.out.print(curr+" ");
				vis[curr] = true;
				for(int i=0; i<graph[curr].size(); i++) {
					Edge e = graph[curr].get(i);
					q.add(e.des);
				}
			}
		}
	}
	public static void DFS(ArrayList<Edge>[] graph) {
		boolean vis[] = new boolean[graph.length];
		for(int i=0; i<graph.length; i++) {
			DFSUtil(graph, i, vis);
		}
	}
	public static void DFSUtil(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
		System.out.print(curr+" ");
		vis[curr] = true;
		
		for(int i=0; i<graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if(!vis[e.des]) {
				DFSUtil(graph,e.des,vis);
			}
		}
	}
	public static boolean hasPath(ArrayList<Edge>[] graph, int src, int des, boolean vis[]) {
		if(src == des) {
			return true;
		}
		vis[src] = true;
		for(int i=0; i<graph[src].size(); i++) {
			Edge e = graph[src].get(i);
			if(!vis[e.des] && hasPath(graph, e.des, des, vis)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean detectCycle(ArrayList<Edge>[] graph) {
		boolean vis[] = new boolean[graph.length];
		for(int i=0; i<graph.length; i++) {
			if(!vis[i]) {
				if(detectCycleUtil(graph,vis,i,-1)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par) {
		vis[curr] = true;
		for(int i=0; i<graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if(!vis[e.des]) {
				if(detectCycleUtil(graph,vis,e.des,curr)) {
					return true;
				}
			}
            else if(!vis[e.des] && e.des != par) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int V = 7;
		ArrayList<Edge>[] graph = new ArrayList[V];
		creategraph(graph,V);
		
		System.out.print("BFS = ");		
		BFS(graph);
		System.out.println();
		System.out.print("DFS = ");
		DFS(graph);
//		
		System.out.println();
		System.out.print("has Path = ");
		System.out.println(hasPath(graph, 0, 5, new boolean[V]));;
		
		System.out.println(detectCycle(graph));
	}
}
