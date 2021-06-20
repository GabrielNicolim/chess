package chess;

import boardgame.Piece;
import boardgame.Board;

public class ChessPiece extends Piece {

	private Color color;
	
	ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	public Color getColor() {
		return color; 
	}
}
