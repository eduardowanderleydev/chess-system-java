package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();

		try {
			while (true) {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());
				System.out.println("");
				System.out.println("print source :");
				ChessPosition source = UI.readChessPosition(in);
				System.out.println("Print target :");
				ChessPosition target = UI.readChessPosition(in);

				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);	
			}
		}
		catch (ChessException e) {
			System.out.println(e.getMessage());
			in.nextLine();
		}
		catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			in.nextLine();
		}

	}
}
