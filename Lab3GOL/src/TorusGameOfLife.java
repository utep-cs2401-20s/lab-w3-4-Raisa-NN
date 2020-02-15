public class TorusGameOfLife extends GameOfLife {
    public TorusGameOfLife() {
    }
    public TorusGameOfLife(int size) {
        this.size = size;
        board = new int[size][size];
        previous = new int[size][size];
    }

    public TorusGameOfLife(int[][] board) {
        this.size = board.length;
        this.board = board;
        previous = new int[size][size];
    }

    @Override
    public int neighbours(int row, int col) {
        int count = 0; //Counts the number of evolutions to pass on to evolution method
        int sumNeighbours = 0;

        if ((col + 1) % size < size && (col + 1) % size >= 0 && (row + 1) % size < size && (row + 1) % size >= 0 && board[row + 1][col + 1] == 1) {
            count++;
        }//If the right bottom neighbour is within the board and is alive, count it as a valid neighbour.

        if ((col - 1) % size < size && (col - 1) % size >= 0 && (row + 1) % size < size && (row + 1) % size >= 0 && board[row + 1][col + 1] == 1) {
            count++;
        }//If the left bottom neighbour is within the board and is alive, count it as a valid neighbour.

        if ((col + 1) % size < size && (col + 1) % size >= 0 && row % size < size && row % size >= 0 && board[row + 1][col + 1] == 1) {
            count++;
        }//If the right neighbour is within the board and is alive, count it as a valid neighbour.

        if ((col - 1) % size < size && (col - 1) % size >= 0 && row % size < size && row % size >= 0 && board[row + 1][col + 1] == 1) {
            count++;
        }//If the left neighbour is within the board and is alive, count it as a valid neighbour.

        if (col % size < size && col % size >= 0 && (row - 1) % size < size && (row - 1) % size >= 0 && board[row + 1][col + 1] == 1) {
            count++;
        }//If the bottom neighbour is within the board and is alive, count it as a valid neighbour.

        if (col % size < size && col % size >= 0 && (row - 1) % size < size && (row - 1) % size >= 0 && board[row + 1][col + 1] == 1) {
            count++;
        }//If the top neighbour is within the board and is alive, count it as a valid neighbour.

        if ((col + 1) % size < size && (col + 1) % size >= 0 && (row - 1) % size < size && (row - 1) % size >= 0 && board[row + 1][col + 1] == 1) {
            count++;
        }//If the top right neighbour is within the board and is alive, count it as a valid neighbour.

        if ((col - 1) % size < size && (col - 1) % size >= 0 && (row - 1) % size < size && (row - 1) % size >= 0 && board[row + 1][col + 1] == 1) {
            count++;
        }//If the top left neighbour is within the board and is alive, count it as a valid neighbour.

        return count;
    }
}


