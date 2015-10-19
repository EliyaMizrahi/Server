package model;

import algorithms.mazeGenerators.Maze3d;

/**
 * The Model is an Interface class that has the following methods.
 * 
 * @author Eliya Mizrahi & Mor Mordoch  
 * @version 1.0
 * @since 17-10-2015
 */

public interface Model {

	public boolean generate (String nameMaze, int y, int x, int z);
	public Maze3d getMaze3d (String nameMaze);
	public boolean solve (String nameMaze, String nameAlgorithm);
	public String getSolutionMaze(String nameMaze);
	public void saveToZip();
	public void loadFromZip();
	public void close();
	
	public Object getUserCommand(String command);
}
