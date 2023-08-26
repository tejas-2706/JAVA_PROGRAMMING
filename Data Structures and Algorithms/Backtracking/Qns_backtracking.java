// BACKTRACKING QUESTIONS
// Note - These are classical questions. Please positively solve them.
// Question 1 :
// Rat in a Maze

public class Qns_backtracking {
    // public static int MazeWays(int maze[][], int i, int j, int n, int m) {
    //     // int w1;
    //     // int w2;
    //     // int w3;
    //     // int w4;
    //     // base condition
    //     if (i == n-1 && j == m-1) {
    //         return 1;
    //     }
    //     else if (i==n || j==m) {
    //         return 0;
    //     }
    //     // recurssion part 
    //     for (int row=0; row<n; row++) {
    //         for (int col=0; col<n; col++) {
    //             if (maze[row][col] == 0) {
    //                 return 0;
    //             }
    //             else {
    //             // up
    //             int w1 = MazeWays(maze,i-1, j,n,m);
    //             // down
    //             int w2 = MazeWays(maze,i+1, j,n,m);
    //             // left
    //             int w3 = MazeWays(maze,i, j-1,n,m);
    //             // right
    //             int w4 = MazeWays(maze,i, j+1,n,m);

    //             }
    //         }
    //         int total = w1+w2+w3+w4;
    //             return total;
    //     }
    //     return 0;
    // }
    public static boolean issafe(int maze[][], int x, int y, int n) {
        if(x<n && y<n && maze[x][y] == 1) {
            return true;
        }
        return false;
    }
    public static boolean ratinmaze(int maze[][], int x, int y, int n, int soln[][]) {
        if (x == n-1 && y == n-1) {
            soln[x][y] = 1;
            return true;
        }
        if (issafe(maze, x, y, n)) {
            soln[x][y] = 1;

            // right
            if(ratinmaze(maze, x+1, y, n, soln)) {
                return true;
            }
            // down
            if(ratinmaze(maze, x, y+1, n, soln)) {
                return true;
            }
            soln[x][y] = 0;
            return false;
        }
        return false;
    }
    // public static void printsoln(int soln[][], int n, int x, int y) {
    //     for (int i=0; i<n; i++) {
    //         for (int j=0; j<n; j++) {
    //             System.out.print(soln[x][y] + " ");
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String[] args) {
        int n = 4;
        int maze[][] = { { 1, 0, 0, 0 },
                        { 1, 1, 0, 1 },
                        { 0, 1, 0, 0 },
                        { 1, 1, 1, 1 } };  

        int soln[][] = new int[n][n];
        if (ratinmaze(maze, 0, 0, n, soln)) {
            // printsoln(soln, n, 0, 0 );
            for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                    System.out.print(soln[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}

