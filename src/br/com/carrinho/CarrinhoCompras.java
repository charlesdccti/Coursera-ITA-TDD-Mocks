/**
 * 
 */
package br.com.carrinho;

import java.util.ArrayList;
import java.util.List;


public class CarrinhoCompras {


	private List<Produto> itens = new ArrayList<Produto>();
	private ObservadorCarrinho observador;
		
	public void adicionaProduto(Produto p) {
		this.itens.add(p);
		
		if(observador != null) {
			observador.produtoAdicionado(p.getNome(), p.getValor());
		}
	}

	public int total() {
		int total = 0;
		for (Produto p : this.itens)
			total += p.getValor();
		return total;
	}

	public void adicionarObservador(MockObservadorCarrinho observador) {
		this.observador = observador;
	}


}
