package com.geeksforgeeks;

public class Suduko {
	public class Point{
		int row;
		int col;
	public Point(int row,int col){
		super();
		this.row=row;
		this.col=col;
	}
	}
	public boolean SolveSudoku(int[][] grid){
		Point point = new Point(0,0);
		if(!UnassignedCell(grid,point)) //if there are no unassigned cell sudoko is solved
			return true;
		for(int num=1;num<=9;num++){ //assign values from 1 to 9 in the grid[row][col]
			if(isSafe(grid,point.row,point.col,num)){
				grid[point.row][point.col]=num;
				if(SolveSudoku(grid))
					return true;
				grid[point.row][point.col]=0;
			}
		}
		return false;
	}
	
	public  boolean UnassignedCell(int[][] grid,Point point){
		for(int row=0;row<grid.length;row++)
			for(int col=0;col<grid.length;col++)
				if(grid[row][col]==0){
					point.row=row;
					point.col=col;
					return true;
				}	
		return false;
	}
	public  boolean UsedInRow(int[][] grid,int row,int num){
		for(int col=0;col<grid.length;col++)
			if(grid[row][col]==num)
				return true;
		return false;
	}
	public  boolean UsedInCol(int[][] grid,int col,int num){
		for(int row=0;row<grid.length;row++)
			if(grid[row][col]==num)
				return true;
		return false;
	}
	public  boolean UsedInBox(int[][] grid,int rowofbox,int colofbox,int num){
		for(int row=0;row<3;row++)
		for(int col=0;col<3;col++)
			if(grid[row+rowofbox][col+colofbox]==num)
				return true;
		return false;
	}
	public  boolean isSafe(int[][] grid,int row,int col,int num){
		return !UsedInRow(grid,row,num)&&
				!UsedInCol(grid,col,num)&&
				!UsedInBox(grid,row-row%3,col-col%3,num);
	}
	public  void printGrid(int[][] grid){
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++)
				System.out.print(grid[i][j]+ "  ");
		System.out.println();
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suduko a =new Suduko();
		int[][] grid= new int[][]{{3, 0, 6, 5, 0, 8, 4, 0, 0},
                 {5, 2, 0, 0, 0, 0, 0, 0, 0},
                 {0, 8, 7, 0, 0, 0, 0, 3, 1},
                 {0, 0, 3, 0, 1, 0, 0, 8, 0},
                 {9, 0, 0, 8, 6, 3, 0, 0, 5},
                 {0, 5, 0, 0, 9, 0, 6, 0, 0},
                 {1, 3, 0, 0, 0, 0, 2, 5, 0},
                 {0, 0, 0, 0, 0, 0, 0, 7, 4},
                 {0, 0, 5, 2, 0, 6, 3, 0, 0}};
		 if (a.SolveSudoku(grid) == true)
			 a.printGrid(grid);
		 else
			 System.out.println("No solution exists");
}

}
