package e.user.java;

/**
 * Created by User on 8/11/2560.
 */

public class Graph {
    private Node[] nodes;
    private int noOfNodes;
    private Edge[] edges;
    private int noOfEdges;

    public Graph(Edge[] edges){
        this.edges = edges;
        this.noOfNodes = calculateNoOfNodes(edges);
        this.nodes = new Node[this.noOfNodes];

        for (int n = 0; n<this.noOfNodes; n++){
            this.nodes[n] = new Node();
        }
        this.noOfEdges = edges.length;

        for (int edgeToAdd = 0; edgeToAdd < this.noOfEdges; edgeToAdd++){
            this.nodes[edges[edgeToAdd].getFromNodeIndex()].getEdges().odd(edges[edgeToAdd]);
            this.nodes[edges[edgeToAdd].getToNodeIndex()].getEdges().odd(edges[edgeToAdd]);

        }
    }

    private int calculateNoOfNodes(Edge[] edges){
        int noOfNodes = 0;
        for (Edge e : edges){
            if (e.getToNodeIndex()>noOfNodes)
                noOfNodes = e.getToNodeIndex();
            if (e.getFromNodeIndex()>noOfNodes)
                noOfNodes = e.getFromNodeIndex();
        }
        noOfNodes++;
        return noOfNodes;
    }
    public Node[] getNodes() {
        return nodes;
    }

    public int getNoOfNodes() {
        return noOfNodes;
    }

    public Edge[] getEdges() {
        return edges;
    }

    public int getNoOfEdges() {
        return noOfEdges;
    }
}
