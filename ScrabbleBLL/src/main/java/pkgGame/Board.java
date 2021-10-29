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
		SetBonus();
		for(int i=0;i<14;i++) {
			for(int j=0; j<14; j++) {
				if(findBonus(i,j)!=null) {
					continue;//not already a bonus tile 
				}
				else {
					puzzle[i][j] = null;
				}
					
			}
		}
		
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
		//red
		bonuses.add(new BonusSquare(0,0, eBonusType.TripleWord));
		bonuses.add(new BonusSquare(0,7, eBonusType.TripleWord));
		bonuses.add(new BonusSquare(0,14, eBonusType.TripleWord));
		bonuses.add(new BonusSquare(7,0, eBonusType.TripleWord));
		bonuses.add(new BonusSquare(7,14, eBonusType.TripleWord));
		bonuses.add(new BonusSquare(14,0, eBonusType.TripleWord));
		bonuses.add(new BonusSquare(14,7, eBonusType.TripleWord));
		bonuses.add(new BonusSquare(14,14, eBonusType.TripleWord));
		//pink
		bonuses.add(new BonusSquare(1,1, eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(2,2, eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(3,3, eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(4,4, eBonusType.DoubleWord));
		
		bonuses.add(new BonusSquare(1,13, eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(1,12, eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(1,11, eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(1,10, eBonusType.DoubleWord));
		
		bonuses.add(new BonusSquare(13,1, eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(12,1, eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(11,1, eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(10,1, eBonusType.DoubleWord));
		
		bonuses.add(new BonusSquare(13,13, eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(12,12, eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(11,11, eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(10,10, eBonusType.DoubleWord));
		//darkblue
		bonuses.add(new BonusSquare(1, 5, eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(1, 9, eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(5, 1, eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(5, 5, eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(5, 9, eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(5, 13, eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(9, 1, eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(9, 5, eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(9, 9, eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(9, 13, eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(13, 5, eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(13, 9, eBonusType.TripleLetter));
		//lightblue
		bonuses.add(new BonusSquare(0, 3, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(0, 11, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(2, 6, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(2, 8, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(3, 0, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(3, 7, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(3, 14, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(6, 2, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(6, 6, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(6, 8, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(6, 12, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(7, 3, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(7, 11, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(8, 2, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(8, 6, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(8, 8, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(8, 12, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(11, 0, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(11, 7, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(11, 14, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(12, 6, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(12, 8, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(14, 3, eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(14, 11, eBonusType.DoubleLetter));
		
		//star
		bonuses.add(new BonusSquare(7, 7, eBonusType.Star));
		
		
		// TODO: Set the bonus squares. Use the default / class Scrabble settings.
	}

}
