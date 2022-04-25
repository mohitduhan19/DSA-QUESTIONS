// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> itr = null;
    private Integer nextval = null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        itr = iterator;
        if(hasNext())nextval = itr.next();
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return nextval;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer val = nextval;
        if(itr.hasNext()){
            nextval = itr.next();
        }else {
            nextval = null;
        }
        return val;
	}
	
	@Override
	public boolean hasNext() {
	 return nextval != null || itr.hasNext();   
	}
}