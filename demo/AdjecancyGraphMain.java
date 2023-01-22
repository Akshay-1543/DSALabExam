package com.labexam.demo;

public class AdjecancyGraphMain
{

	public static void main(String[] args)
	{
		AdjacencyGraph g = new AdjacencyGraph(5);
        g.addEdge(0, 1);
        g.addEdge(2, 3);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.printGraph();
	}

}
