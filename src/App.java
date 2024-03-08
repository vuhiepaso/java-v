import com.model.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String position;
        String chessman;
        String isExit;

        do {
            for (int row = 8; row >= 1; row--) {
                System.out.print(row + "| ");
                for (char col = 'A'; col <= 'H'; col++) {
                    System.out.print(col + "" + row + " ");
                }
                System.out.println();
            }
            System.out.println("==================================");
            System.out.println("Nhap vi tri VD: C5");
            position = scanner.nextLine();

            System.out.println("Nhap quan co VD: xe, ma, si, hau, vua, tot");
            chessman = scanner.nextLine();

            switch (chessman.toLowerCase()) {
                case "xe":
                    Rook rook = new Rook(position);
                    rook.ValidMove();
                    break;
                case "ma":
                    Knight knight = new Knight(position);
                    knight.ValidMove();
                    break;
                case "si":
                    Bishop bishop = new Bishop(position);
                    bishop.ValidMove();
                    break;
                case "hau":
                    Queen queen = new Queen(position);
                    queen.ValidMove();
                    break;
                case "vua":
                    King king = new King(position);
                    king.ValidMove();
                    break;
                case "tot":
                    Pawns pawns = new Pawns(position);
                    pawns.ValidMove();
                    break;
                default:
                    System.out.println("Position khong hop le");
                    break;
            }
            System.out.println("==================================");
            System.out.println("Nhap [ exit ] de thoat. Khong nhap hoac nhap bat ki de tiep tuc");
            isExit = scanner.nextLine();
        } while (!isExit.equals("exit"));
        scanner.close();
        System.out.println("End_____");

    }

}
