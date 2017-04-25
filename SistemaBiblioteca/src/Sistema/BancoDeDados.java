package Sistema;

public interface BancoDeDados {
	public String inserirUsuario(Usuario usuario);
	public String removerUsuario(String usuario);
	public String bloquearUsuario(Usuario usuario);

}
