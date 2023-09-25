package Graphs;
import java.util.*;
public class Cheapest_Flight_K_Stops {
	static class Edge{
		int src;
		int des;
		int wt;
		public Edge(int s,int d,int w) {
			this.src = s;
			this.des = d;
			this.wt = w;
		}
	}
	static class Info{
		int vertex;
		int cost;
		int stops;
		public Info(int v,int c,int k) {
			this.vertex = v;
			this.cost = c;
			this.stops = k;
		}
	}
	public static void createGraph(int flights[][],ArrayList<Edge>[] graph) {
		for(int i=0; i<graph.length; i++) {
			graph[i] = new ArrayList<Edge>(); 
		}
		for(int i=0; i<flights.length; i++) {
			int src = flights[i][0];
			int dest = flights[i][1];
			int wt = flights[i][2];
			graph[src].add(new Edge(src,dest,wt));
		}
	}
	public static int cheapestFlight(int flights[][],int n, int src,int dest,int k) {
		ArrayList<Edge>graph [] = new ArrayList[n];
	    createGraph(flights, graph);
	    
	    int dist[] = new int[n];
	    for(int i=0; i<n; i++) {
	    	if(i != src) {
	    		dist[i] = Integer.MAX_VALUE;
	    	}
	    }
	    Queue<Info> q = new LinkedList<>();
	    q.add(new Info(0,0,0));
	    while(!q.isEmpty()) {
	    	Info curr = q.remove();
	    	if(curr.stops > k) {
	    		break;
	    	}
	    	for(int i=0; i<graph[curr.vertex].size(); i++) {
	    		Edge e = graph[curr.vertex].get(i);
	    		int u = e.src;
	    		int v = e.des;
	    		int wt = e.wt;
	    		if(curr.cost + wt < dist[v] && curr.stops<=k) {
	    			dist[v] = curr.cost + wt;
	    			q.add(new Info(v,dist[v],curr.stops+1));
	    		}
	    	}
	    }
	    if(dist[dest] == Integer.MAX_VALUE) {
	    	return -1;
	    }else {
	    	return dist[dest];
	    }
	    
	}
	public static void main(String args[]) {
		int flights[][] = {
				{0,1,100},
				{1,2,100},
				{2,0,100},
				{1,3,600},
				{2,3,200}
		};
		int n = 4;
		int src = 0, dest = 3, k = 1;
		int cf = cheapestFlight(flights, n, src, dest, k);
	    System.out.print("Route Cost With K stops only = "+cf);
	}
}
