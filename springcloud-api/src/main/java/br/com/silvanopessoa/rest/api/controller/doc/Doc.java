/******************************************************************************
 * Produto: REST                                                              *
 *                                                                            *
 *    History:                                                                *
 *          Data        Programador              Tarefa                       *
 *          ----------  -----------------        -----------------------------*
 *   Autor  04/11/2015  silvano.pessoa          Classe criada.                *
 *                                                                            *
 *   Comments:                                                                *
 *                                                                            *
 *                                                                            *
 *****************************************************************************/
package br.com.silvanopessoa.rest.api.controller.doc;

/**
 * The Class Doc.
 */
public final class Doc {

	/**
	 * Instancia um novo(a) doc.
	 */
	private Doc() {
		//Classe de constantes de controles.
	}
	
	/** A Constante READ_SCOPE. */
	public static final String READ_SCOPE = "read";
	
	/** A Constante WRITE_SCOPE. */
	public static final String WRITE_SCOPE = "write";
	
	/** A Constante READ_DESCRIPTION. */
	public static final String READ_DESCRIPTION = "read only";
	
	/** A Constante WRITE_DESCRIPTION. */
	public static final String WRITE_DESCRIPTION = "write only";
	
	/** A Constante USUARIO_NOTES_GET_BY_LOGIN. */
	public static final String USUARIO_NOTES_GET_BY_LOGIN ="<br><b>Descrição:</b> Obtem usuario pelo identificador informado.<br><br> <b>Clientes:</b> Todos.<br><b>Scope:</b> read<br><b>Roles System:</b> ROLE_CLIENT<br><b>Roles User:</b> ROLE_REST_USER_FIND<br><b>Tarefas:</b> <a href=\"https://github.com/silvanopessoa/rest\" target=\"_blank\">#1</a><br><b>Documentação Canônico:</b> Não informado.<br><b>Documentação Teste:</b> Não informado.<br><b>Tipos de Autenticação:</b> password<br>";

	/** A Constante USUARIO_VALUE_GET_BY_LOGIN. */
	public static final String USUARIO_VALUE_GET_BY_LOGIN = "Obtem um usuário pelo seu identificador.";
	
	/** A Constante USUARIO_VALUE_DELETE_BY_LOGIN. */
	public static final String USUARIO_VALUE_DELETE_BY_LOGIN = "Inativa um usuário pelo seu identificador.";
	
	/** A Constante USUARIO_NOTES_DELETE_BY_LOGIN. */
	public static final String USUARIO_NOTES_DELETE_BY_LOGIN = "";
	
	/** A Constante USUARIO_VALUE_PUT. */
	public static final String USUARIO_VALUE_PUT= "Altera um usuário.";

	/** A Constante USUARIO_NOTES_PUT. */
	public static final String USUARIO_NOTES_PUT= "";

	/** A Constante USUARIO_VALUE_POST. */
	public static final String USUARIO_VALUE_POST= "";

	/** A Constante USUARIO_NOTES_POST. */
	public static final String USUARIO_NOTES_POST= "";
}
