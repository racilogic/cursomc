package br.com.racilogic.cursomc.domain;

import java.io.Serializable;

import javax.persistence.Entity;

import br.com.racilogic.cursomc.domain.enums.EstadoPagamento;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(of = "id")
public class Pagamento  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private EstadoPagamento estado;
	
	private Pedido pedido;
	
	public Pagamento() {
	}

	public Pagamento(Integer id, EstadoPagamento estado, Pedido pedido) {
		super();
		this.id = id;
		this.estado = estado;
		this.pedido = pedido;
	}
	
}
