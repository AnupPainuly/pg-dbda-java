package non_generic;

public class Holder {
//state : any data type (primitive or ref type)
	private Object ref;

	public Holder(Object ref) {
		super();
		this.ref = ref;
	}

	public Object getRef() {
		return ref;
	}

}
