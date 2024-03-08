package com.model;

import java.util.ArrayList;
import utils.common.HandleMove;

public class Queen extends ChessPiece {
    public Queen(String position) {
        super(position);
    }

    @Override
    public void ValidMove() {
        String position = super.getPosition();
        String[] lisValidMoveDiagonalLines = HandleMove.straightHorizontal(position).toArray(new String[0]);
        ArrayList<String> lisValidMove = HandleMove.diagonalLines(position);
        for (int i = 0; i < lisValidMoveDiagonalLines.length; i++) {
            lisValidMove.add(lisValidMoveDiagonalLines[i]);
        }

        String[] validMove = lisValidMove.toArray(new String[0]);
        super.printChessBoardWithMove(position, validMove);
    }

}
