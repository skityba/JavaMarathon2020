package day17;

import static day17.ChessPiece.*;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] figures = {PAWN_WHITE, PAWN_WHITE, PAWN_WHITE, PAWN_WHITE, ROOK_BLACK, ROOK_BLACK,
                ROOK_BLACK, ROOK_BLACK};
        for(int i = 0; i < 8; i++) {
            System.out.print(figures[i] + " ");
        }
    }
}