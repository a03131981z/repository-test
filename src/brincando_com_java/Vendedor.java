package brincando_com_java;

public class Vendedor implements Comissionado{
	
	private float totalDeVendas;

	public float getTotalDeVendas() {
		return this.totalDeVendas;
	}
	
	public void setTotalDeVendas(float total) {
		this.totalDeVendas = total;
	}
	
	@Override
	public float calcularComissao() {
		float var = (totalDeVendas*2.5f)/100;
		return var;
	}
}
