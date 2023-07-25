import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
public class biPartiteTest {

    //This test case tests a graph if it is bipartite and has no odd cycles, no islands, and is 2-colorable
    @Test
    public void validWoOddWoIslandTwoColorable()
    {
        biPartiteSolution testCase=new biPartiteSolution();
        int[][] graph1=new int[][]{
                {2, 3},
                {1, 4},
                {1, 4},
                {2, 3},
        };
        assertTrue(testCase.isBipartite(graph1)); //should be true and pass the test
    }

    //This test case tests if the below graph is bipartite and has no odd cycles, but has an island.
    @Test
    public void validWoOddWIsland()
    {
        biPartiteSolution testCase=new biPartiteSolution();
        int[][] graph = new int[][] {
                {2, 3},
                {1, 4},
                {1, 4},
                {2, 3},
                {}
        };
        assertTrue(testCase.isBipartite(graph)); //should be true and pass the test
    }

    //This test case tests if the graph is bipartite and can have 3 colors in its graph
    @Test
    public void valid3Colorable()
    {
        biPartiteSolution testCase=new biPartiteSolution();
        int[][] graph = new int[][] {
                {2},
                {1, 3},
                {2, 4},
                {3},
        };
        assertTrue(testCase.isBipartite(graph)); //should be true and pass the test
    }

    //This test case tests if a null graph can be bipartite
    @Test
    public void testNullGraph() {
        biPartiteSolution testCase = new biPartiteSolution();
        int[][] graph = null;  // Null graph

        assertFalse(testCase.isBipartite(graph)); //Should be false and pass the test
    }

    //
    @Test
    public void testEmptyGraph()
    {
        biPartiteSolution testCase = new biPartiteSolution();
        int[][] graph = new int[0][0];
        assertTrue(testCase.isBipartite(graph));
    }

    @Test
    public void invalidWoOddWoIslands()
    {
        biPartiteSolution testCase = new biPartiteSolution();
        int[][] graph = new int[][] {
                {2, 4},
                {1, 3},
                {2, 4},
                {1, 3},
        };

        assertFalse(testCase.isBipartite(graph));
    }

    @Test
    public void invalidTwoColorableor3Colorable()
    {
        biPartiteSolution testCase = new biPartiteSolution();
        int[][] graph = new int[][] {
                {2},
                {1, 3},
                {2},
        };

        assertFalse(testCase.isBipartite(graph));
    }

}
