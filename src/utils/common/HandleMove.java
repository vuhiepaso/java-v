package utils.common;

import java.util.ArrayList;

public class HandleMove {

    public static ArrayList<String> straightHorizontal(String position) {
        ArrayList<String> validMoves = new ArrayList<String>();
        char positionX = position.charAt(0); // A to H
        int positionY = Character.getNumericValue(position.charAt(1)); // 1 to 8

        for (int row = 8; row >= 1; row--) {
            for (char col = 'A'; col <= 'H'; col++) {
                if (positionX == col || positionY == row) {
                    String key = col + String.valueOf(row);
                    validMoves.add(key);
                }

            }
        }
        return validMoves;
    }

    public static ArrayList<String> diagonalLines(String position) {
        ArrayList<String> validMoves = new ArrayList<String>();
        char startX = position.charAt(0);
        int startY = Character.getNumericValue(position.charAt(1));

        for (; startX <= 'H'; startX++) {
            String key = startX + String.valueOf(startY);
            validMoves.add(key);
            startY--;
        }

        startX = position.charAt(0);
        startY = Character.getNumericValue(position.charAt(1));
        for (; startX <= 'H'; startX++) {
            String key = startX + String.valueOf(startY);
            validMoves.add(key);
            startY++;
        }

        startX = position.charAt(0);
        startY = Character.getNumericValue(position.charAt(1));
        for (; startX >= 'A'; startX--) {
            String key = startX + String.valueOf(startY);
            validMoves.add(key);
            startY++;
        }

        startX = position.charAt(0);
        startY = Character.getNumericValue(position.charAt(1));
        for (; startX >= 'A'; startX--) {
            String key = startX + String.valueOf(startY);
            validMoves.add(key);
            startY--;
        }

        return validMoves;
    }

}
