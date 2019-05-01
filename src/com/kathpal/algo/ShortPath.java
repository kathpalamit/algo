package com.kathpal.algo;

public class ShortPath {

	public static void main(String[] args) {
		/* Let us create the example graph discussed above */
		int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
				{ 0, 8, 0, 7, 0, 4, 0, 0, 2 }, { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
				{ 0, 0, 4, 14, 10, 0, 2, 0, 0 }, { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
				{ 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
		ShortPath t = new ShortPath();
		t.dijkstra(graph, 0);
	}
	
	private  void dijkstra(int [][] graph, int node) {
		
		int[] distance = new int[graph.length];
		boolean[] isFinalized = new boolean[graph.length];
		
		for(int i=0;i<graph.length;i++) {
			distance[i] = Integer.MAX_VALUE;
			isFinalized[i] = false;
		}
		
		distance[node] = 0;
		
		for(int row = 0;row<graph.length;row++) {
			
			int index = findShortestValueIndex(distance,isFinalized);
			isFinalized[index] = true;
			
			for(int col = 0; col<graph.length;col++) {
				
				if(!isFinalized[col] && graph[index][col] !=0 && distance[index]!=Integer.MAX_VALUE && distance[index]+graph[index][col]<distance[col]) {
					distance[col] = distance[index]+graph[index][col];
				}
				
			}
			
		}
		
		printSolution(distance);
		
	}
	
	
	private  int findShortestValueIndex(int[] distance, boolean[] isFinalized){
		
		int min = Integer.MAX_VALUE, index = -1;
		
		for(int i=0;i<distance.length;i++) {
			if(!isFinalized[i] && distance[i]<=min ) {
				index = i;
				min= distance[i];
			}
		}
		return index;
		
	}
	
	 void printSolution(int dist[]) 
	    { 
	        System.out.println("Vertex   Distance from Source"); 
	        for (int i = 0; i < 9; i++) 
	            System.out.println(i+" tt "+dist[i]); 
	    } 

}
