package com.model;

import java.util.ArrayList;

public class King extends ChessPiece {
   public King(String position) {
      super(position);
   }

   @Override
   public void ValidMove() {
      String position = super.getPosition();
      ArrayList<String> lisValidMove = new ArrayList<String>();
      char positionX = position.charAt(0); // A to H
      int positionY = Character.getNumericValue(position.charAt(1)); // 1 to 8

      char colStat = (char) (positionX - 1);
      int rowStat = positionY + 1;

      char colEnd = (char) (positionX + 1);
      int rowEnd = positionY - 1;

      for (int row = rowStat; row >= rowEnd; row--) {
         for (char col = colStat; col <= colEnd; col++) {
            String key = col + String.valueOf(row);
            lisValidMove.add(key);

         }
      }

      String[] validMove = lisValidMove.toArray(new String[0]);
      super.printChessBoardWithMove(position, validMove);

   }
}
