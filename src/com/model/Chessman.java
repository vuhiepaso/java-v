package com.model;

import java.util.Arrays;

abstract class ChessPiece {
    private String position;

    public ChessPiece(String position) {
        this.position = position;
    }

    public abstract void ValidMove();

    public String getPosition() {
        return position;
    }

    public static void printChessBoardWithMove(String position, String[] validMove) {
        System.out.println(" -----------------------");
        for (int row = 8; row >= 1; row--) {
            System.out.print(row + "| ");
            for (char col = 'A'; col <= 'H'; col++) {
                String key = col + String.valueOf(row);
                if (position.equals(col + "" + row)) {
                    System.out.print("## ");
                } else if (includes(validMove, key)) {
                    System.out.print("   ");
                } else {
                    System.out.print(col + "" + row + " ");
                }
            }
            System.out.println();
        }
        System.out.println(" -----------------------");
        System.out.println("   A  B  C  D  E  F  G  H");

    }

    private static boolean includes(String[] array, String elementToCheck) {
        return Arrays.stream(array).anyMatch(element -> element.equals(elementToCheck));
    }

}
