/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Mauro
 */
public class Sudoku {
	
	int sudokufeld[][] =
		{
		 {5, 3, 4, 6, 7, 8, 9, 1, 2},
		 {6, 7, 2, 1, 9, 5, 3, 4, 8},
		 {1, 9, 8, 3, 4, 2, 5, 6, 7},
		 {8, 5, 9, 7, 6, 1, 4, 2, 3},
		 {4, 2, 6, 8, 5, 3, 7, 9, 1},
		 {7, 1, 3, 9, 2, 4, 8, 5, 6},
		 {9, 6, 1, 5, 3, 7, 2, 8, 4},
		 {2, 8, 7, 4, 1, 9, 6, 3, 5},
		 {3, 4, 5, 2, 8, 6, 1, 7, 9}
		};

	public Sudoku(int sudokufeld[][]){
		this.sudokufeld = sudokufeld;
	}
	
	public Sudoku(){
		
	}
	
	public boolean checkSudoku(){
		boolean correct = true;
		
		//Jede Zeile prüfen
		for(int zeile = 0; zeile < sudokufeld.length;zeile++){
			for(int spalte = 0; spalte < sudokufeld[zeile].length;spalte++){
				for(int naechstespalte = spalte+1; naechstespalte < sudokufeld[zeile].length;naechstespalte++){
					if(sudokufeld[zeile][spalte] == sudokufeld[zeile][naechstespalte] || !checkZahl(sudokufeld[zeile][spalte])){
						correct = false;
					}
				}
			}
		}
		
		//Jede Spalte prüfen
		for(int spalte = 0; spalte < sudokufeld.length;spalte++){
			for(int zeile = 0; zeile < sudokufeld.length;zeile++){
				for(int naechstezeile = zeile+1; naechstezeile < sudokufeld[zeile].length;naechstezeile++){
					if(sudokufeld[zeile][spalte] == sudokufeld[naechstezeile][spalte] || !checkZahl(sudokufeld[zeile][spalte])){
						correct = false;
					}
				}
			}
		}
		
		//Die Quadrate prüfen
		for(int quadratzeile = 0;quadratzeile < 9 && correct;quadratzeile = quadratzeile + 3){
			for(int quadratspalte = 0;quadratspalte < 9 && correct;quadratspalte = quadratspalte + 3){
				correct = checkQuadrat(quadratzeile, quadratspalte);
			}
		}
		
		return correct;
	}
	
	private boolean checkQuadrat(int quadratzeile, int quadratspalte){
		boolean correct = true;
		
		int quadratAlsZeile[] = new int[9];
		int quadratAlsZeileIndex = 0;
		for(int zeile = quadratzeile; zeile < quadratzeile + 3;zeile++){
			for(int spalte = quadratspalte; spalte < quadratspalte + 3;spalte++){
				quadratAlsZeile[quadratAlsZeileIndex] = sudokufeld[zeile][spalte];
				quadratAlsZeileIndex++;
			}
		}

		for(int i = 0; i < quadratAlsZeile.length;i++){
			for(int j = i+1; j < quadratAlsZeile.length;j++){
				if(quadratAlsZeile[i] == quadratAlsZeile[j]){
					correct = false;
				}
			}	
		}
		return correct;
	}
	
	private boolean checkZahl(int zahl){
		boolean correct = true;
		switch(zahl){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			break;
		default:
			correct = false;
		}
		return correct;
	}
	
	public static void main(String args[]){
                System.out.println("Sudoku Checks startet");
		Sudoku sudoku = new Sudoku();
		sudoku.checkSudoku();
                System.out.println("Sudoku Checks finished");
	}
	
	

}
