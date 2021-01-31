package day17;

import static day17.ChessPiece.*;

public class ChessBoard {
    private static ChessPiece[][] newArr;

    ChessBoard(ChessPiece[][] newArr){
        ChessBoard.newArr = newArr;
    }

    public void print() {
        for(int i = 0; i < newArr.length; i++){
            for(int j = 0; j < newArr[i].length;j++){
                if (newArr[i][j] == null){
                    newArr[i][j] = EMPTY;
                }
                System.out.print(newArr[i][j]);
            }
            System.out.println();
        }
    }
}
