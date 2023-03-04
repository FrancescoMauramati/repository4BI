
public class Triangolo {
	String base, altezza;

	@Override
	public String toString() {
		return "Triangolo [base=" + base + ", altezza=" + altezza + "]";
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getAltezza() {
		return altezza;
	}

	public void setAltezza(String altezza) {
		this.altezza = altezza;
	}

	public Triangolo(String base, String altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}
}
