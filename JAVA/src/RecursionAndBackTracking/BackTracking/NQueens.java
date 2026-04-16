package RecursionAndBackTracking.BackTracking;

public class NQueens {
    static boolean isSafe(char[][]board, int row, int col){
        //columns
        for(int i=0; i<row; i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // left diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // right diagonal
        for(int i=row-1, j=col+1; i>=0 && j< board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    static void solve(char[][] board, int row){
        // base case
        if(row == board.length){
            for(char[] r: board){
                System.out.println(java.util.Arrays.toString(r));
            }
            System.out.println();
            return ;
        }
        for(int col=0; col<board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q'; // place the Queen
                solve(board, row+1); // Go to the next row
                board[row][col] = '.'; // remove and explore the other possibilities
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        solve(board, 0);
    }
}