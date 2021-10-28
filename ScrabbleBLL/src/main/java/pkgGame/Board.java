package pkgGame;

import eNum.eBonusType;
import java.util.ArrayList;


public class Board {

	private Space[][] puzzle;
	private ArrayList<BonusSquare> bonuses = new ArrayList<BonusSquare>();

	/**
	 * Board - Constructor. Create the board, set the Space / Bonus Square for each
	 * square in the board
	 * 
	 * @author BRG
	 * @version Lab #6
	 * @since Lab #6
	 */
	public Board() 
	{
		puzzle = new Space[14][14];
		
		// TODO: Call SetBonus() to set the original bonus setup
		// TODO: Create the default puzzle
		// TODO: Loop through each place in the puzzle, insert a 'space' object, value
		// the BonusSquare
		// object if there's a bonus in that cell.
	}

	public Space[][] getPuzzle() {
		return puzzle;
	}

	/**
	 * findBonus - interrogate the bonuses ArrayList and return the bonus square if
	 * there is one
	 * 
	 * @author BRG
	 * @version Lab #6
	 * @since Lab #6
	 * @param Row
	 * @param Col
	 * @return
	 */
	private BonusSquare findBonus(int Row, int Col) {
		for (BonusSquare bs : this.bonuses) {
			if (bs.getRow() == Row && bs.getCol() == Col) {
				return bs;
			}
		}
		return null;
	}

	/**
	 * SetBonus - This method will set the bonuses ArrayList with all the bonus
	 * squares in the game
	 * 
	 * @author BRG
	 * @version Lab #6
	 * @since Lab #6
	 */
	private void SetBonus() 
	{
		bonuses.add(new BonusSquare(0,0, TripleWord);
		bonuses.add(new BonusSquare(0,3, DoubleLetter));
		bonuses.add(new BonusSquare(0, 7, TripleWord));
		bonuses.add(new BonusSquare(0, 11, DoubleLetter));
		bonuses.add(new BonusSquare(0, 14, TripleWord));
		
		// TODO: Set the bonus squares. Use the default / class Scrabble settings.
	}

}
