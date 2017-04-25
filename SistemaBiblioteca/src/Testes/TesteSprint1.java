package Testes;

import static org.junit.Assert.*;

import org.junit.Test;
import Sistema.*;

import static org.mockito.Mockito.*;

public class TesteSprint1 {

	BancoDeDados bd = mock(BancoDeDados.class);
	Bibliotecaria bibliotecaria = new Bibliotecaria(bd);
	
	@Test
	public void inserirUmNovoUsuarioComSucesso() {
		Usuario usuario1 = new Usuario("Leonardo");
		when(bd.inserirUsuario(usuario1)).thenReturn("Usu�rio Leonardo inserido com sucesso.");
		assertEquals("Usu�rio Leonardo inserido com sucesso.",bibliotecaria.inserirUsuario(usuario1));
		Usuario usuario2 = new Usuario("Luiz");
		when(bd.inserirUsuario(usuario2)).thenReturn("Usu�rio Luiz inserido com sucesso.");
		assertEquals("Usu�rio Luiz inserido com sucesso.",bibliotecaria.inserirUsuario(usuario2));
	}
	
	@Test
	public void falhaAoInserirUmNovoUsuario() {
		Usuario usuario = new Usuario("Leonardo");
		when(bd.inserirUsuario(usuario)).thenReturn("N�o foi poss�vel inserir o usu�rio Leonardo. Nome j� existente.");
		assertEquals("N�o foi poss�vel inserir o usu�rio Leonardo. Nome j� existente.",bibliotecaria.inserirUsuario(usuario));
	}
	
	@Test
	public void removerUsuarioComSucesso() {
		when(bd.removerUsuario("Leonardo")).thenReturn("Usu�rio Leonardo removido com sucesso");
		assertEquals("Usu�rio Leonardo removido com sucesso",bibliotecaria.removerUsuario("Leonardo"));
	}
	
	@Test
	public void falhaAoRemoverUsuario() {
		when(bd.removerUsuario("Leonardo")).thenReturn("N�o foi poss�vel remover usu�rio Leonardo. Esse usu�rio n�o existe.");
		assertEquals("N�o foi poss�vel remover usu�rio Leonardo. Esse usu�rio n�o existe.",bibliotecaria.removerUsuario("Leonardo"));
	}
	
	@Test
	public void bloquearUsuarioComSucesso() {
		assertEquals("Usuario Luiz bloqueado com sucesso.",bibliotecaria.bloquearUsuario("Luiz"));
	}
	
	@Test
	public void falhaAoBloquearUsuarioPorNaoExistir() {
		assertEquals("N�o foi poss�vel bloquear usu�rio Leonardo. Esse usu�rio n�o existe.",bibliotecaria.bloquearUsuario("Leonardo"));
	}
	
	@Test
	public void falhaAoBloquearUsuarioPorJaEstarBloqueado() {
		assertEquals("N�o foi poss�vel bloquear usu�rio Luiz. Esse usu�rio j� est� bloqueado.",bibliotecaria.bloquearUsuario("Luiz"));
	}

}
