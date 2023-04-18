package generic;
//generic class example
public class Holder<T> {
//state : any data type (primitive or ref type)
	private T ref;

	public Holder(T ref) {
		super();
		this.ref = ref;
	}

	public T getRef() {
		return ref;
	}

}
