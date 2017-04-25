package Sistema;

public interface BancoDeDados {
	public String inserirUsuario(Usuario usuario);
	public String removerUsuario(String nomeUsuario);
	public String bloquearUsuario(String nomeUsuario);

}
