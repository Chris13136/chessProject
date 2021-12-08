package model.pieces;

public class Knight extends ChessPiece {

	public Knight(int row, int col, int color) {
		super(row, col, color);
		name = "Knight";
	}

	@Override
	public boolean isValidMove(int row, int col, ChessPiece[][] pieces) {
		if(pieces[col][row] != null && pieces[col][row].getColor() == this.color) {
			return false;
		}
		// row +1 col +2
		if (this.row + 1 == row && this.col + 2 == col) {
			
			return true;
		}
		// row +1 col -2
		if (this.row + 1 == row && this.col - 2 == col) {
			
			return true;
		}
		// row -1 col +2
		if (this.row - 1 == row && this.col + 2 == col) {
			
			return true;
		}
		// row -1 col -2
		if (this.row - 1 == row && this.col - 2 == col) {
			
			return true;
		}
		// row +2 col +1
		if (this.row + 2 == row && this.col + 1 == col) {
			
			return true;
		}
		// row +2 col -1
		if (this.row + 2 == row && this.col - 1 == col) {
			
			return true;
		}
		// row -2 col +1
		if (this.row - 2 == row && this.col + 1 == col) {
			return true;
		}
		// row -2 col -1
		if (this.row - 2 == row && this.col - 1 == col) {
			
			return true;
		}
		return false;
	}

}
