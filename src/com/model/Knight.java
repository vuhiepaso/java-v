package com.model;

import java.util.ArrayList;

public class Knight extends ChessPiece {
   public Knight(String position) {
      super(position);
   }

   @Override
   public void ValidMove() {
      String position = super.getPosition();
      ArrayList<String> lisValidMove = new ArrayList<String>();
      char positionX = position.charAt(0); // A to H
      int positionY = Character.getNumericValue(position.charAt(1)); // 1 to 8

      String key;
      key = (char) (positionX + 1) + String.valueOf(positionY + 2); // top
      lisValidMove.add(key);

      key = (char) (positionX + 2) + String.valueOf(positionY - 1); // right
      lisValidMove.add(key);

      key = (char) (positionX - 1) + String.valueOf(positionY - 2); // left
      lisValidMove.add(key);

      key = (char) (positionX - 2) + String.valueOf(positionY + 1); // bottom
      lisValidMove.add(key);

      String[] validMove = lisValidMove.toArray(new String[0]);
      super.printChessBoardWithMove(position, validMove);
   }
}
