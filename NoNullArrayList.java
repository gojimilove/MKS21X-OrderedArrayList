import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public T set(int index, T x) {
  	if (x == null) throw new IllegalArgumentException("cannot set a value as null");
  	return super.set(index, x);
  }

	public boolean add(T x) {
  	if (x == null) throw new IllegalArgumentException("cannot add a null value");
  	return super.add(x);
  }

  public void add(int index, T x) {
  	if (x == null) throw new IllegalArgumentException("cannot add a null value");
  	super.add(index, x);
  }

}
