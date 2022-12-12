package exemplos.ex001.entities;

//esta classe nao pode ser instanciada
public abstract class Conta {

	private Integer num;
	private String titular;
	protected Double balanco;

	public Conta() {

	}

	public Conta(Integer num, String titular, Double balanco) {
		this.num = num;
		this.titular = titular;
		this.balanco = balanco;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getBalanco() {
		return balanco;
	}

	public void saqueConta(double quantia) {
		balanco -= quantia + 5.0;
	}

	public void depositoConta(double quantia) {
		balanco += quantia;
	}

}
