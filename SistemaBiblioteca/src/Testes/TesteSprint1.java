package Testes;

import static org.junit.Assert.*;

import org.junit.Test;
import Sistema.*;

import static org.mockito.Mockito.*;

public class TesteSprint1 {

	BancoDeDados bd = mock(BancoDeDados.class);
	Bibliotecaria bibliotecaria = new Bibliotecaria();
	
	@Test
	public void inserirUmNovoUsuarioComSucesso() {
		Usuario usuario1 = new Usuario("Leonardo");
		assertEquals("Usuário Leonardo inserido com sucesso.",bibliotecaria.inserirUsuario(usuario1));
		Usuario usuario2 = new Usuario("Luiz");
		assertEquals("Usuário Leonardo inserido com sucesso.",bibliotecaria.inserirUsuario(usuario2));
	}
	
	@Test
	public void falhaAoInserirUmNovoUsuario() {
		Usuario usuario = new Usuario("Leonardo");
		assertEquals("Não foi possível inserir o usuário Leonardo. Nome já existente.",bibliotecaria.inserirUsuario(usuario));
	}
	
	@Test
	public void removerUsuarioComSucesso() {
		assertEquals("Usuário Leonardo removido com sucesso",bibliotecaria.removerUsuario("Leonardo"));
	}
	
	@Test
	public void falhaAoRemoverUsuario() {
		assertEquals("Não foi possível remover usuário Leonardo. Esse usuário não existe.",bibliotecaria.removerUsuario("Leonardo"));
	}
	
	@Test
	public void bloquearUsuarioComSucesso() {
		assertEquals("Usuario Luiz bloqueado com sucesso.",bibliotecaria.bloquearUsuario("Luiz"));
	}
	
	@Test
	public void falhaAoBloquearUsuarioPorNaoExistir() {
		assertEquals("Não foi possível bloquear usuário Leonardo. Esse usuário não existe.",bibliotecaria.bloquearUsuario("Leonardo"));
	}
	
	@Test
	public void falhaAoBloquearUsuarioPorJaEstarBloqueado() {
		assertEquals("Não foi possível bloquear usuário Luiz. Esse usuário já está bloqueado.",bibliotecaria.bloquearUsuario("Luiz"));
	}

}
