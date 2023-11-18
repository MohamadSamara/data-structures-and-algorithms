package graph.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    Graph<String> stringGraph;
    Graph<Integer> integerGraph;

    @BeforeEach
    void createGraph() {
        stringGraph = new Graph<>();
        integerGraph = new Graph<>();
    }

    @Test
    void assertAddVertex(){
        stringGraph.addVertex("Mohammed");
        assertTrue(stringGraph.isContainValue("Mohammed"));
        // to make sure is isContainValue is work
        assertFalse(stringGraph.isContainValue("Mohammed22"));
    }

    @Test
    void assertAddVertex2(){
        integerGraph.addVertex(20);
        assertTrue(integerGraph.isContainValue(20));
        // to make sure is isContainValue is work
        assertFalse(integerGraph.isContainValue(30));
    }

    @Test
    void assertAddEdges(){
        Vertex<Integer> vertex1 = new Vertex<>(10);
        Vertex<Integer> vertex2 = new Vertex<>(20);
        Vertex<Integer> vertex3 = new Vertex<>(30);

        integerGraph.addVertex(vertex1.getValue());
        integerGraph.addVertex(vertex2.getValue());
        integerGraph.addVertex(vertex3.getValue());
        integerGraph.addEdge(vertex1,vertex2);
        assertTrue(integerGraph.isConnected(vertex1,vertex2));
        // to make sure is isContainValue is work
        assertFalse(integerGraph.isConnected(vertex1,vertex3));
    }

    @Test
    void assertAllVertexes(){
        Vertex<Integer> vertex1 = new Vertex<>(10);
        Vertex<Integer> vertex2 = new Vertex<>(20);
        Vertex<Integer> vertex3 = new Vertex<>(30);
        integerGraph.addVertex(vertex1.getValue());
        integerGraph.addVertex(vertex2.getValue());
        integerGraph.addVertex(vertex3.getValue());
        integerGraph.addEdge(vertex1,vertex2);
        integerGraph.addEdge(vertex1,vertex3);
        //// Neighbors are returned with the weight between vertexes included
        String excepted ="[10  connected to 30 weight: 0, 10  connected to 20 weight: 0]";
        assertEquals(excepted,integerGraph.getNeighbors(vertex1).toString());

    }

    @Test
    void assertAllNeighbors (){
        Vertex<Integer> vertex1 = new Vertex<>(10);
        Vertex<Integer> vertex2 = new Vertex<>(20);
        Vertex<Integer> vertex3 = new Vertex<>(30);
        integerGraph.addVertex(vertex1.getValue());
        integerGraph.addVertex(vertex2.getValue());
        integerGraph.addVertex(vertex3.getValue());
        assertNotEquals(0,integerGraph.getVertices().size());

    }

    @Test
    void size(){
        Vertex<Integer> vertex1 = new Vertex<>(10);
        Vertex<Integer> vertex2 = new Vertex<>(20);
        Vertex<Integer> vertex3 = new Vertex<>(30);
        integerGraph.addVertex(vertex1.getValue());
        integerGraph.addVertex(vertex2.getValue());
        integerGraph.addVertex(vertex3.getValue());
        assertEquals(3,integerGraph.size());

    }
    /// A graph with only one vertex and edge can be properly returned
    @Test
    void testOnVertex(){
        Vertex<Integer> vertex1 = new Vertex<>(10);
        integerGraph.addVertex(vertex1.getValue());
        String excepted ="Graph{size=1, vertexes={10=10 edges -> []}}";
        assertEquals(excepted,integerGraph.toString());
    }


}