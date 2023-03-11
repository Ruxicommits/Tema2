public class Main {
    public static void main(String[] args) {
        // Exemplu de labirint
        int[][] maze = {
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0}
        };

        MazeSolver solver = new MazeSolver(maze, 0, 0, 4, 4);
        solver.solve();
    }
}
