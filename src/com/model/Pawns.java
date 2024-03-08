package com.model;

import java.util.ArrayList;

public class Pawns extends ChessPiece {
   public Pawns(String position) {
      super(position);
   }

   @Override
   public void ValidMove() {
      String position = super.getPosition();
      ArrayList<String> lisValidMove = new ArrayList<String>();
      char positionX = position.charAt(0); // A to H
      int positionY = Character.getNumericValue(position.charAt(1)); // 1 to 8

      String key;
      key = positionX + String.valueOf(positionY + 1); // top
      lisValidMove.add(key);
      if (positionY < 3) {
         key = positionX + String.valueOf(positionY + 2); // top
         lisValidMove.add(key);
      }

      String[] validMove = lisValidMove.toArray(new String[0]);

      if (positionY > 1) {
         super.printChessBoardWithMove(position, validMove);
      } else {
         System.err.println("Vi tri khong hop le");
      }

   }
}
