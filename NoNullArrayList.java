import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int initialCapacity){
    super(initialCapacity);
  }
  public T set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("cannot set null");
    }
    else{
      return super.set(index,element);
    }
  }
  public boolean add(T element){
    if (element == null){
      throw new IllegalArgumentException("cannot add null");
    }
    else{
      return super.add(element);
    }
  }
  public void add(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("cannot add null");
    }
    else{
      super.add(index,element);
    }
  }
}
