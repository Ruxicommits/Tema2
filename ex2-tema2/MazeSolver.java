import java.util.Stack;

    public class MazeSolver {

        private int[][] maze;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public MazeSolver(int[][] maze, int startX, int startY, int endX, int endY) {
            this.maze = maze;
            this.startX = startX;
            this.startY = startY;
            this.endX = endX;
            this.endY = endY;
        }

        public void solve() {
            // Inițializăm stiva cu poziția de start
            Stack<int[]> stack = new Stack<>();
            stack.push(new int[]{startX, startY});

            while (!stack.isEmpty()) {
                int[] current = stack.pop();
                int x = current[0];
                int y = current[1];

                // Verificăm dacă am ajuns la destinație
                if (x == endX && y == endY) {
                    System.out.println("Am ajuns la destinație!");
                    return;
                }

                // Verificăm dacă poziția curentă este validă
                if (x < 0 || y < 0 || x >= maze.length || y >= maze[0].length || maze[x][y] == 1) {
                    continue;
                }

                // Marcăm poziția curentă ca vizitată
                maze[x][y] = 1;

                // Adăugăm în stivă toate pozițiile adiacente nevizitate
                stack.push(new int[]{x + 1, y});
                stack.push(new int[]{x - 1, y});
                stack.push(new int[]{x, y + 1});
                stack.push(new int[]{x, y - 1});
            }

            System.out.println("Nu s-a găsit nicio soluție.");
        }
}
