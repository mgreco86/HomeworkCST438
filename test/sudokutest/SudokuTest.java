/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokutest;

import junit.framework.TestCase;
import sudoku.Sudoku;

/**
 *
 * @author Mauro
 */
public class SudokuTest extends TestCase {

	public void testCheckSudoku1() {
		Sudoku sudoku = new Sudoku();
		assertEquals(true, sudoku.checkSudoku());
	}

	public void testCheckSudoku2() {
		int sudokufeld[][] =
			{
			 {5, 3, 4, 6, 7, 8, 8, 1, 3},
			 {6, 7, 2, 1, 9, 5, 3, 4, 8},
			 {1, 9, 8, 3, 4, 2, 5, 6, 7},
			 {8, 5, 9, 7, 6, 1, 4, 2, 3},
			 {4, 2, 6, 8, 5, 3, 7, 9, 1},
			 {7, 1, 3, 9, 2, 4, 8, 5, 6},
			 {9, 6, 1, 5, 3, 7, 2, 8, 4},
			 {2, 8, 7, 4, 1, 9, 6, 3, 5},
			 {3, 4, 5, 2, 8, 6, 2, 7, 8}
			};
		Sudoku sudoku = new Sudoku(sudokufeld);
		assertEquals(false, sudoku.checkSudoku());
	}
	
	public void testCheckSudoku3() {
		int sudokufeld[][] =
			{
			 {5, 3, 7, 6, 7, 8, 9, 1, 2},
			 {6, 7, 2, 1, 9, 5, 3, 4, 8},
			 {1, 9, 4, 3, 8, 2, 5, 6, 7},
			 {8, 5, 9, 7, 6, 1, 4, 2, 3},
			 {4, 2, 6, 8, 5, 3, 7, 9, 1},
			 {7, 1, 3, 9, 2, 4, 8, 5, 6},
			 {9, 6, 8, 5, 3, 7, 2, 1, 4},
			 {2, 8, 1, 4, 7, 9, 6, 3, 5},
			 {3, 4, 5, 2, 8, 6, 1, 7, 9}
			};
		Sudoku sudoku = new Sudoku(sudokufeld);
		assertEquals(false, sudoku.checkSudoku());
	}
	
	public void testCheckSudoku4() {
		int sudokufeld[][] =
			{
			 {5, 5, 5, 5, 5, 5, 5, 5, 5},
			 {5, 5, 5, 5, 5, 5, 5, 5, 5},
			 {5, 5, 5, 5, 5, 5, 5, 5, 5},
			 {5, 5, 5, 5, 5, 5, 5, 5, 5},
			 {5, 5, 5, 5, 5, 5, 5, 5, 5},
			 {5, 5, 5, 5, 5, 5, 5, 5, 5},
			 {5, 5, 5, 5, 5, 5, 5, 5, 5},
			 {5, 5, 5, 5, 5, 5, 5, 5, 5},
			 {5, 5, 5, 5, 5, 5, 5, 5, 5}
			};
		Sudoku sudoku = new Sudoku(sudokufeld);
		assertEquals(false, sudoku.checkSudoku());
	}
	
	public void testCheckSudoku5() {
		int sudokufeld[][] =
			{
			 {5, 3, 4, 6, 7, 8, 9, 1, 2},
			 {6, 7, 2, 1, 9, 5, 3, 4, 8},
			 {8, 5, 9, 7, 6, 1, 4, 2, 3},
			 {4, 2, 6, 8, 5, 3, 7, 9, 1},
			 {7, 1, 3, 9, 2, 4, 8, 5, 6},
			 {9, 6, 1, 5, 3, 7, 2, 8, 4},
			 {1, 9, 8, 3, 4, 2, 5, 6, 7},
			 {2, 8, 7, 4, 1, 9, 6, 3, 5},
			 {3, 4, 5, 2, 8, 6, 1, 7, 9}
			};
		Sudoku sudoku = new Sudoku(sudokufeld);
		assertEquals(false, sudoku.checkSudoku());
	}
	
	public void testCheckSudoku6() {
		int sudokufeld[][] =
			{
			 {5, 3, 4, 6, 7, 8, 9, 12, 2},
			 {6, 7, 2, 12, 9, 5, 3, 4, 8},
			 {12, 9, 8, 3, 4, 2, 5, 6, 7},
			 {8, 5, 9, 7, 6, 12, 4, 2, 3},
			 {4, 2, 6, 8, 5, 3, 7, 9, 12},
			 {7, 12, 3, 9, 2, 4, 8, 5, 6},
			 {9, 6, 12, 5, 3, 7, 2, 8, 4},
			 {2, 8, 7, 4, 12, 9, 6, 3, 5},
			 {3, 4, 5, 2, 8, 6, 12, 7, 9}
			};
		Sudoku sudoku = new Sudoku(sudokufeld);
		assertEquals(false, sudoku.checkSudoku());
	}
}
