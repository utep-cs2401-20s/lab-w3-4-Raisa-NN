public class GameOfLife {
    int size;
    int[][] board;
    int[][] previous;

    public GameOfLife() {
    }

    public GameOfLife(int size) {
        this.size = size;
        board = new int[size][size];
        previous = new int[size][size];
    }

    public GameOfLife(int[][] board) {
        this.size = board.length;
        this.board = board;
        previous = new int[size][size];
    }

    public int[][] getBoard() {
        return board;
    }

    public int neighbours(int row, int col) {
        int count = 0; //Counts the number of evolutions to pass on to evolution method

        if (col + 1 < size && col + 1 >= 0 && row + 1 < size && row + 1 >= 0 && board[row + 1][col + 1] == 1) {
            count++;
        }//If the right bottom neighbour is within the board and is alive, count it as a valid neighbour.

        if (col - 1 < size && col - 1 >= 0 && row + 1 < size && row + 1 >= 0 && board[row + 1][col + 1] == 1) {
            count++;
        }//If the left bottom neighbour is within the board and is alive, count it as a valid neighbour.

        if (col + 1 < size && col + 1 >= 0 && row < size && row >= 0 && board[row + 1][col + 1] == 1) {
            count++;
        }//If the right neighbour is within the board and is alive, count it as a valid neighbour.

        if (col - 1 < size && col - 1 >= 0 && row < size && row >= 0 && board[row + 1][col + 1] == 1) {
            count++;
        }//If the left neighbour is within the board and is alive, count it as a valid neighbour.

        if (col < size && col >= 0 && row - 1 < size && row - 1 >= 0 && board[row + 1][col + 1] == 1) {
            count++;
        }//If the bottom neighbour is within the board and is alive, count it as a valid neighbour.

        if (col < size && col >= 0 && row - 1 < size && row - 1 >= 0 && board[row + 1][col + 1] == 1) {
            count++;
        }//If the top neighbour is within the board and is alive, count it as a valid neighbour.

        if (col + 1 < size && col + 1 >= 0 && row - 1 < size && row - 1 >= 0 && board[row + 1][col + 1] == 1) {
            count++;
        }//If the top right neighbour is within the board and is alive, count it as a valid neighbour.

        if (col - 1 < size && col - 1 >= 0 && row - 1 < size && row - 1 >= 0 && board[row + 1][col + 1] == 1) {
            count++;
        }//If the top left neighbour is within the board and is alive, count it as a valid neighbour.

        return count;
    }

    public void evolution(int n) { //n is the number of evolution steps
        for (int i = 0; i <= n; i++) {
            oneStep();
        }
    }

    public void oneStep() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int sumNeighbours = neighbours(i, j);

                if (board[i][j] == 1) { //If that cell is alive
                    if (sumNeighbours < 2) { //If live cell has less than 2 neighbours, it dies
                        previous[i][j] = 0;
                    }
                    if ((sumNeighbours == 2) || (sumNeighbours == 3)) { //If live cell has 2 or 3 neighbours, it survives
                        previous[i][j] = 1;
                    }
                    if (sumNeighbours > 3) { //If live cell has more than 3 neighbours, it dies
                        previous[i][j] = 0;
                    }
                } else { //If cell is dead
                    if (sumNeighbours == 3) { //If dead cell has exactly 3 neighbours, it lives
                        previous[i][j] = 0;
                    }
                }
            }
        }
        int[][] temp = board; //Swapping boards; previous held updated changes and is sent to board and the current board becomes previous.
        board = previous;
        previous = temp;
    }
}
