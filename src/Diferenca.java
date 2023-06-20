
public class Diferenca {

	private String propriedade;
	private Object valorNovo;
	private Object valorVelho;

	public Diferenca(String propriedade, Object valorNovo, Object valorVelho) {
		super();
		this.propriedade = propriedade;
		this.valorNovo = valorNovo;
		this.valorVelho = valorVelho;
	}
	
	public String getPropriedade() {
		return propriedade;
	}
	public void setPropriedade(String propriedade) {
		this.propriedade = propriedade;
	}
	public Object getValorNovo() {
		return valorNovo;
	}
	public void setValorNovo(Object valorNovo) {
		this.valorNovo = valorNovo;
	}
	public Object getValorVelho() {
		return valorVelho;
	}
	public void setValorVelho(Object valorVelho) {
		this.valorVelho = valorVelho;
	}
	@Override
	public String toString() {
		return "Diferenca [propriedade=" + propriedade + ", valorNovo=" + valorNovo + ", valorVelho=" + valorVelho
				+ "]";
	}
}
