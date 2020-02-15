import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GOLTester {

    @Test
    public void testNeighboursTGOL1() {
        GameOfLife sol = new GameOfLife();
        assertEquals(2, sol.neighbours(2, 2));
    }

    @Test
    public void testNeighboursTGOL2() {
        GameOfLife sol = new GameOfLife();
        assertEquals(1, sol.neighbours(2, 3));
    }

    @Test
    public void testNeighboursTGOL3() {
        GameOfLife sol = new GameOfLife();
        assertEquals(1, sol.neighbours(2, 4));
    }

    @Test
    public void testNeighboursTGOL4() {
        GameOfLife sol = new GameOfLife();
        assertEquals(3, sol.neighbours(3, 2));
    }

    @Test
    public void testNeighboursTGOL5() {
        GameOfLife sol = new GameOfLife();
        assertEquals(0, sol.neighbours(4, 0));
    }

    @Test
    public void testOneStepTGOL1() {
        int[][] testBoard = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}};
        int[][] testPrevious = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}};
        GameOfLife sol = new GameOfLife(testBoard);
        sol.evolution(3);
        assertArrayEquals(testPrevious, sol.getBoard());
    }

    @Test
    public void testOneStepTGOL2() {
        int[][] testBoard = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}};
        int[][] testPrevious = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}};
        GameOfLife sol = new GameOfLife(testBoard);
        sol.evolution(0);
        assertArrayEquals(testPrevious, sol.getBoard());
    }

    @Test
    public void testOneStepTGOL3() {
        int[][] testBoard = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int[][] testPrevious = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        GameOfLife sol = new GameOfLife(testBoard);
        sol.evolution(1);
        assertArrayEquals(testPrevious, sol.getBoard());
    }

    @Test
    public void testOneStepTGOL4() {
        int[][] testBoard = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int[][] testPrevious = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        GameOfLife sol = new GameOfLife(testBoard);
        sol.evolution(2);
        assertArrayEquals(testPrevious, sol.getBoard());
    }

    @Test
    public void testOneStepTGOL5() {
        int[][] testBoard = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int[][] testPrevious = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        GameOfLife sol = new GameOfLife(testBoard);
        sol.evolution(5);
        assertArrayEquals(testPrevious, sol.getBoard());
    }

    @Test
    public void testEvolutionTGOL1() {
        int[][] testBoard = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int[][] testPrevious = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        GameOfLife sol = new GameOfLife(testBoard);
        sol.evolution(1);
        assertArrayEquals(testPrevious, sol.getBoard());
    }

    @Test
    public void testEvolutionTGOL2() {
        int[][] testBoard = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int[][] testPrevious = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        GameOfLife sol = new GameOfLife(testBoard);
        sol.evolution(0);
        assertArrayEquals(testPrevious, sol.getBoard());
    }

    @Test
    public void testEvolutionTGOL3() {
        int[][] testBoard = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int[][] testPrevious = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        GameOfLife sol = new GameOfLife(testBoard);
        sol.evolution(5);
        assertArrayEquals(testPrevious, sol.getBoard());
    }

    @Test
    public void testEvolutionTGOL4() {
        int[][] testBoard = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int[][] testPrevious = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        GameOfLife sol = new GameOfLife(testBoard);
        sol.evolution(2);
        assertArrayEquals(testPrevious, sol.getBoard());
    }

    @Test
    public void testEvolutionTGOL5() {
        int[][] testBoard = {{0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
        int[][] testPrevious = {{0, 0, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
        GameOfLife sol = new GameOfLife(testBoard);
        sol.evolution(5);
        assertArrayEquals(testPrevious, sol.getBoard());
    }
}
