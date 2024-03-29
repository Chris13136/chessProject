
/**
 * @filename ChessPiece.java
 * @author Garrison Mendlik 12/8/2021
 * @author Jasnam Swani
 * @author Harshvardhan Bhatnagar
 * @author Chris Brinkley
 * @purpose Chess piece superclass.
 */

package model.pieces;

public abstract class ChessPiece {

	protected int row;
	protected int col;
	protected final int color; // TODO: Color needs to be to determine valid
								// move. especially for pawns.
	public String name;

	/**
	 * Creates a new chess piece.
	 * 
	 * @param row   Row to create chess piece at
	 * @param col   Column to create chess piece at
	 * @param color Team color of the chess piece
	 */
	public ChessPiece(int row, int col, int color) {
		this.setPosition(row, col);
		this.color = color;
	}

	/**
	 * 
	 * @return the color of the piece
	 */
	public int getColor() {
		return this.color;
	}

	/**
	 * 
	 * @return the col of the piece
	 */
	public int getCol() {
		return this.col;
	}

	/**
	 * 
	 * @return the row of the piece
	 */
	public int getRow() {
		return this.row;
	}

	/**
	 * Returns true if the move is valid.
	 * 
	 * @param row    Row of potential move
	 * @param col    Column of potential move
	 * @param pieces The board of pieces
	 * @return True if the move is valid.
	 */
	public abstract boolean isValidMove(int row, int col,
			ChessPiece[][] pieces);

	/**
	 * Sets the position of the piece
	 * 
	 * @param row Row where the chess piece is located
	 * @param col Column where the chess piece is located
	 */
	public void setPosition(int row, int col) {
		this.row = row;
		this.col = col;
	}

	/**
	 * @return Returns a string representation of the chess piece
	 */
	public String toString() {
		String out = "Row: " + Integer.toString(this.row) + ", Col: "
				+ Integer.toString(this.col) + ", Color: "
				+ Integer.toString(this.color) + ", Name " + this.name + ".";
		return out;
	}
}
