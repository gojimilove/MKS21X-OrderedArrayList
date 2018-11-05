public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
  	super(startingCapacity);
  }

  public T set(int index, T x) {
  	if (x == null) throw new IllegalArgumentException("cannot add a null value");
  	T old = get(index);
  	remove(index);
  	add(x);
  	return old;
  }

  public boolean add(T x) {
  	if (x == null) throw new IllegalArgumentException("cannot add a null value");
  	int newIndex = 0;
  	for (int i = 0; i < size(); i++) {
  		if (x.compareTo(get(i)) >= 0) newIndex = i + 1;
  	}
  	super.add(newIndex, x);
  	return true;
  }

  public void add(int index, T x) {
  	add(x);
  }
}
