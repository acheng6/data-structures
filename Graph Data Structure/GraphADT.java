package ADTs;

import java.util.ArrayList;


/**
 * A simplified interface for an undirected, unweighted graph
 * No iterators, but methods for depth-first traversal and 
 * breadth-first traversal are provided
 * 
 * For use in ITCS 2214 Data Structures & Algorithms
 * UNC Charlotte, 2016
 * @author clatulip
 */
public interface GraphADT<T> extends CollectionADT {
    
    /**
     * 
     * Adds the vertex to the graph
     * @param vertex the vertex to be added
     */
    public void addVertex(T vertex) ;
    
    /**
     * Removes the specified vertex
     * @param vertex the vertex to be removed
     */
    public void removeVertex(T vertex);
    

    
    /**
     * Adds an edge between the two specified vertices
     * @param vertex1 the first vertex
     * @param vertex2 the second vertex
     */
    public void addEdge(T vertex1, T vertex2);
    
     /**
     * Removes the edge between the two specified vertices
     * @param vertex1 the first vertex
     * @param vertex2 the second vertex
     */
    public void removeEdge(T vertex1, T vertex2);
    
    /**
     * Returns an ArrayList of T vertices arrived at through
     * depth-first traversal starting at specified vertex
     * @param startVertex
     * @return array of vertices from depth-first traversal
     */
    public ArrayList<T> depthFirstTraversal(T startVertex);
    
    /**
     * Returns an ArrayList of T vertices arrived at through
     * breadth-first traversal starting at specified vertex
     * @param startVertex
     * @return array of vertices from breadth-first traversal
     */
    public ArrayList<T> breadthFirstTraversal(T startVertex);
    
    /**
     * Returns true if this graph is connected, false otherwise
     * @return true if this graph is connected
     */
    public boolean isConnected();
}
