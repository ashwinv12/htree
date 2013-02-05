/**
 * HTree
 *
 * 		Recursively draws an HTree
 * 		
 */

import java.awt.Graphics;

public class HTree {
	
	private int x, y, length, depth;
	private Graphics g;

	public static final int MAX_DEPTH = 7;


	/**
	 * Constructor
	 *
	 * @param x - center x position of the htree
	 * @param y - center y position of the htree
	 * @param length - length of a line in the largest h of the tree
	 */
	public HTree(int x, int y, int length) {
		this.x = x;
		this.y = y;
		this.lenth = length;
		this.depth = 1;
	}
}