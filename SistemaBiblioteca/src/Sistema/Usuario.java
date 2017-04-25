package Sistema;

public class Usuario {
	private String nome;
	
	public Usuario(String nome){
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
