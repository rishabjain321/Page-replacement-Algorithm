package jnachos.kern.mem;

import java.util.*;
import jnachos.machine.*;
import jnachos.kern.*;

/**
 * 
 * @author rijain@syr.edu
 *
 */
public class LRU implements PageReplacementAlgorithm {  
	
	public static final LinkedList<Integer> LRUlist=new LinkedList<Integer>();
	
	public  LRU() {
		
	}
	
	@Override
	public int chooseVictimPage() {
		return LRUlist.removeLast();
		}
}