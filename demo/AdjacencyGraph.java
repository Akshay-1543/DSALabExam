package com.labexam.demo;

public class AdjacencyGraph 
{

	private final int vert;
	private int[][] adjacencyMatrix;

	//below method is used for the vertices
	public AdjacencyGraph(int vert) {
		this.vert = vert;
		adjacencyMatrix = new int[vert][vert];
	}

	public void addEdge(int source, int destination) {
		adjacencyMatrix[source][destination] = 1;
	}

	//Below Method is used to print the graph
	public void printGraph() {
		System.out.println("Graph Implemented using adjacency matrix:");
		for (int i = 0; i < vert; i++) {
			for (int j = 0; j < vert; j++) {
				System.out.print(adjacencyMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
