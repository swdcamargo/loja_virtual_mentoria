package jdev.mentoria.lojavirtual.enums;

public enum TipoEndereco {

	COBRANCA("Cobrança"),
	ENTREGA("Entrga");
	
	private String descricao;
	
	private TipoEndereco(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return this.descricao;
	}
	
	
}
