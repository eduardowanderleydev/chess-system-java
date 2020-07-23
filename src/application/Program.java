package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println("");
			System.out.println("print source :");
			ChessPosition source = UI.readChessPosition(in);
			System.out.println("Print target :");
			ChessPosition target = UI.readChessPosition(in);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			
		}
		
		
	}
}
