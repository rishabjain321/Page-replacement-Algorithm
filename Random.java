package jnachos.kern.mem;

/**
 * 
 * @author rijain@syr.edu
 *
 */
public class Random implements PageReplacementAlgorithm {
	public Random() {
	}
	@Override
	
	 
	public int chooseVictimPage() {
		return (int)Math.random()*16; // as max size of array 15
	}
}
