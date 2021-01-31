package day17;

import static day17.ChessPiece.*;
import static day17.ChessPiece.KING_WHITE;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] newArr = new ChessPiece[8][8];
        newArr[0][0] = ROOK_BLACK;
        newArr[0][5] = ROOK_BLACK;
        newArr[0][6] = KING_BLACK;
        newArr[1][1] = ROOK_WHITE;
        newArr[1][4] = PAWN_BLACK;
        newArr[1][5] = PAWN_BLACK;
        newArr[1][7] = PAWN_BLACK;
        newArr[2][0] = PAWN_BLACK;
        newArr[2][2] = KNIGHT_BLACK;
        newArr[2][6] = PAWN_BLACK;
        newArr[3][0] = QUEEN_BLACK;
        newArr[3][3] = BISHOP_WHITE;
        newArr[4][3] = BISHOP_BLACK;
        newArr[4][4] = PAWN_WHITE;
        newArr[5][4] = BISHOP_WHITE;
        newArr[5][5] = PAWN_WHITE;
        newArr[6][0] = PAWN_WHITE;
        newArr[6][3] = QUEEN_WHITE;
        newArr[6][5] = PAWN_WHITE;
        newArr[6][7] = PAWN_WHITE;
        newArr[7][5] = ROOK_WHITE;
        newArr[7][6] = KING_WHITE;

        ChessBoard chessBoard = new ChessBoard(newArr);

        chessBoard.print();
    }
}


