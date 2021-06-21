package chess;

import boardgame.Piece;
import boardgame.Board;

public abstract class ChessPiece extends Piece {

	private Color color;
	
	protected ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	public Color getColor() {
		return color; 
	}
}
