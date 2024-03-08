package com.model;

import utils.common.HandleMove;

public class Rook extends ChessPiece {
   public Rook(String position) {
      super(position);
   }

   @Override
   public void ValidMove() {
      String position = super.getPosition();
      String[] validMove = HandleMove.straightHorizontal(position).toArray(new String[0]);
      super.printChessBoardWithMove(position, validMove);
   }
}
