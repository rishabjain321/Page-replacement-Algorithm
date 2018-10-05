package jnachos.kern.mem;

import java.util.*;
import jnachos.kern.*;
/**
 * 
 * @author rijain@syr.edu
 *
 */
public class FIFO implements PageReplacementAlgorithm {  
	
	public static final LinkedList<Integer> list=new LinkedList<Integer>();
	
	public  FIFO() {
		
	}
	
	@Override
	public int chooseVictimPage() {
		int page = list.getFirst();
		list.removeFirst();
		list.addLast(page);
		return list.getLast();
		
		}
}
