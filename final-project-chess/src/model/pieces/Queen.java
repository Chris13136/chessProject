
/**
 * @filename Queen.java
 * @author Garrison Mendlik 12/8/2021
 * TODO: Add your names
 * @purpose Queen chess piece implementation.
 */

package model.pieces;

public class Queen extends ChessPiece {

	/**
	 * Creates a new queen piece.
	 * 
	 * @param row   Row to place the queen at
	 * @param col   Column to place the queen at
	 * @param color Team color of the queen
	 */
	public Queen(int row, int col, int color) {
		super(row, col, color);
		name = "Queen";
	}

	@Override
	/**
	 * Checks if the move is valid for the queen piece
	 * 
	 * @param row    Row to attempt to move to
	 * @param col    Column to attempt to move to
	 * @param pieces ChessPiece[][] array containing the board's pieces
	 * @return Returns true if the queen can make the move
	 */
	public boolean isValidMove(int row, int col, ChessPiece[][] pieces) {

		if (pieces[col][row] != null
				&& pieces[col][row].getColor() == this.color) {
			return false;
		}

		if (this.row == row) {
			// right check
			for (int i = this.col + 1; i < col; i++) {
				if (pieces[i][row] != null) {
					return false;
				}
			}
			// left check
			for (int i = this.col - 1; i > col; i--) {
				if (pieces[i][row] != null) {
					return false;
				}
			}
			return true;
		}

		// up down check
		if (this.col == col) {
			// up check
			for (int i = this.row + 1; i < row; i++) {
				if (pieces[col][i] != null) {
					return false;
				}
			}
			// down check
			for (int i = this.row - 1; i > row; i--) {
				if (pieces[col][i] != null) {
					return false;
				}
			}
			return true;
		}

		return checkDiagnols(row, col, pieces);

	}

	public boolean checkDiagnols(int row, int col, ChessPiece[][] pieces) {
		if (this.row == row || this.col == col) {
			return false;
		}
		// default to +,+
		int colOff = 1;
		int rowOff = 1;

		if (Integer.signum(this.row - row) == 1) {
			rowOff = -1;
		}

		if (Integer.signum(this.col - col) == 1) {
			colOff = -1;
		}
		int curCol = this.col + colOff;
		int curRow = this.row + rowOff;

		while (curCol != col) {
			if (pieces[curCol][curRow] != null) {
				return false;
			}
			curCol += colOff;
			curRow += rowOff;
		}
		return true;
	}

}
