package com.model;

import utils.common.HandleMove;

public class Bishop extends ChessPiece {
   public Bishop(String position) {
      super(position);
   }

   @Override
   public void ValidMove() {
      String position = super.getPosition();
      String[] validMove = HandleMove.diagonalLines(position).toArray(new String[0]);
      super.printChessBoardWithMove(position, validMove);
   }

}
