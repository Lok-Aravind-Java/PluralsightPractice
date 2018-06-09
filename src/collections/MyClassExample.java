package collections;

public class MyClassExample {


	public MyClassExample(String label, int a) {
		super();
		this.label = label;
		this.a = a;
	}

	@Override
	public String toString() {
		return "MyClassExample [label=" + label + ", a=" + a + "]";
	}

	private String label;
    private int a;
    
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
