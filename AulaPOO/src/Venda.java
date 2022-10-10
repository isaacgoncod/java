import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

	private Long id;
	private String descricaoVenda;
	private String nomeCliente;
	private String enderecoEntrega;
	private BigDecimal valoTotal;

	private List<Produto> listaProdutos = new ArrayList<Produto>();

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	
	public void addProduto(Produto produto) {
		this.listaProdutos.add(produto);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoVenda() {
		return descricaoVenda;
	}
	

	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public BigDecimal getValoTotal() {
		return valoTotal;
	}

	public void setValoTotal(BigDecimal valoTotal) {
		this.valoTotal = valoTotal;
	} 
	
	public double getTotalVenda() {
		double total = 0.0;
		
		for(Produto produto : listaProdutos) {
			total += produto.getValor().doubleValue();
		}
		return total;
	}

	@Override
	public String toString() {
		return "Venda [id=" + id + ", descricaoVenda=" + descricaoVenda + ", nomeCliente=" + nomeCliente
				+ ", enderecoEntrega=" + enderecoEntrega + ", valoTotal=" + valoTotal + ", listaProdutos="
				+ listaProdutos + "]";
	}
	

}
