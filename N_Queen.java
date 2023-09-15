public class N_Queen {
    public static void main(String[] args) {
        int n=2;
        char board[][]=new char[n][n];
        //initialize
        for(int i=0;i<n;i++)

        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        N_Queen(board,0);
    }
    public static void N_Queen(char board[][],int row)
    {
        for(int j=0;j<board.length;j++)
        {
            board[row][j]='Q';
            N_Queen(board, row+1);
            board[row][j]='.';

            //base
            if(row==board.length)
            {
                printBoard(board);
                return;
            }
            public static void printBoard(char board[][])
            {
                System.out.println("-------------------");
                for (int i = 0; i < board.length; i++) {
                    System.out.println(board[i][j]+" ");
            }
            System.out.println();
        }
        public static boolean isSafe(char board[][],int row,int col)
        {
            //vertically upSafe or not

            //diagonally left up
            for(int i=row-1;i>=0;i--)
            {
                if(board[i][col]=='Q')
                {
                    return false;
                }
            }

            //diag right up
            for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
            {
                if(board[i][j]=='Q')
                {
                    return false;
                }
            }
            return true;
        }

    }
}
}