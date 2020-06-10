package com.example.models;

import java.util.List;

public class Board {
	Tile[][] board;
	
	public Board(int width, int height) {
		this.board = new Tile[width][height];
		for(int i=0;i<width;i++) {
			for(int j=0;j<height;j++) {
				this.board[i][j] = new Tile();
			}
		}
	}
	
	public Tile getTile(int x, int y) {
		return board[x-1][y-1];
	}
	
	public void addUnit(Unit u, int x, int y) {
		getTile(x, y).addUnit(u);
	}
	
	public void removeUnit(Unit u, int x, int y) {
		getTile(x, y).remoteUnit(u);
	}
	
	public List<Unit> getUnits(int x, int y){
		return getTile(x,y).getUnits();
	}
	
	public void removeUnits(int x, int y) {
		getTile(x,y).removeUnits();
	}
}
