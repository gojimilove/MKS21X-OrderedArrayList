public class OrderedArrayList extends NoNullArrayList {
  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
  	super(startingCapacity);
  }

  public T set(int index, T x) {
  	remove(index);
  	return add(x);
  }

  public boolean add(T x) {
  	
  }

  public void add(int index, T x) {
  	return add(x);
  }
}
