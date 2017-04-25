package Sistema;

public class Bibliotecaria {
	
	private BancoDeDados bancoDeDados;
	
	public Bibliotecaria(BancoDeDados bd){
		bancoDeDados = bd;
	}
	
	public String inserirUsuario(Usuario usuario){
		return bancoDeDados.inserirUsuario(usuario);
	}
	
	public String removerUsuario(String nomeUsuario){
		return bancoDeDados.removerUsuario(nomeUsuario);
	}
	
	public String bloquearUsuario(String nomeUsuario){
		return bancoDeDados.bloquearUsuario(nomeUsuario);
	}

}
