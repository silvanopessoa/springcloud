/******************************************************************************
 * Produto: REST                                                              *
 *                                                                            *
 *    History:                                                                *
 *          Data        Programador              Tarefa                       *
 *          ----------  -----------------        -----------------------------*
 *   Autor  14/05/2015  silvano.pessoa          Classe criada.                *
 *                                                                            *
 *   Comments:                                                                *
 *                                                                            *
 *                                                                            *
 *****************************************************************************/
package br.com.silvanopessoa.rest.api.controller;

import static org.apache.http.HttpHeaders.IF_MODIFIED_SINCE;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.annotation.security.RolesAllowed;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * O(a) Class UsuarioController.
 *
 * @author silvano.pessoa
 * @see http://spring.io/guides/gs/rest-service/
 * @since 25/10/2014 - 23:56:38
 */
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    /** LOG. */
    private static final Logger LOGGER = LoggerFactory.getLogger(UsuarioController.class);
    
    /**
     * Salva o(a) usuario. 
     * 
     * If a resource has been created on the origin server,
     * 
     * Resposta: the response SHOULD be 201 (Created)
     * @author silvano.pessoa
     * 
     * @param usuario o(a) usuario
     * @return the response entity
     * 
     * @see http://azagorneanu.blogspot.com.br/2013/06/hateoas-using-spring-framework.html
     * @see http://restpatterns.org/HTTP_Methods/POST
     */
    @RequestMapping(method = POST, produces = { APPLICATION_XML_VALUE, APPLICATION_JSON_VALUE })
    public ResponseEntity<Void> createUsuario(@RequestBody String usuario) {
        LOGGER.info("POST USUARIO | Iniciado | Salvar usuário. Entity:" + usuario);
        LOGGER.info("POST USUARIO | Concluido | Salvar usuário." + usuario);
        return new ResponseEntity<Void>(CREATED);
    }
    
    /**
     * Atualiza o(a) usuario.
     *  
     * @param login O(a)(s) login
     * @param usuario O(a)(s) usuario
     * @return O(a)(s) response entity
     * 
     * @author silvano.pessoa
     * @see Spec - http://restpatterns.org/HTTP_Methods/PUT
     * @see ROLE - UserDetailsServiceImpl
     */
    public ResponseEntity<Void> updateUsuario(@PathVariable("login") String login, @RequestBody String usuario){
        LOGGER.info("PUT USUARIO | Iniciado | Alterar usuário. Usuário:{}, Entity:{}",usuario,login);
        LOGGER.info("PUT USUARIO | Concluido | Alterar usuário. Usuário:{}, Entity:{}",usuario,login);
        return new ResponseEntity<>(NO_CONTENT);
    }
    
    /**
     * Exclui o(a) usuario.
     * 
     * @param login o(a) login
     * 
     * @author silvano.pessoa
     * @see http://restpatterns.org/HTTP_Methods/DELETE
     * @see ROLE - UserDetailsServiceImpl
     */
	@RolesAllowed({"ROLE_REST_USER_DELETE"})
    @RequestMapping(value = "/{login}", method = DELETE, produces = { APPLICATION_XML_VALUE, APPLICATION_JSON_VALUE })
    public ResponseEntity<Void> deleteUsuario(@PathVariable("login") String login) {
        LOGGER.info("DELETE USUARIO | Iniciado | Inativa o usuário:{}",login);
        LOGGER.info("DELETE USUARIO | Identificador | Inativa o usuário: {}",login);
        LOGGER.info("DELETE USUARIO | Concluído | Inativa o usuário: {}",login);
		return new ResponseEntity<>(NO_CONTENT);
    }
    
    /**
     * Obtém o valor do(a)(s) usuario.
     *
     * @author silvano.pessoa
     * @param login o(a) login
     * @param dataAlteracao o(a) data alteracao
     * @return o(a) usuario
     * 
     * @author silvano.pessoa
     * @see http://www.restpatterns.org/HTTP_Methods/GET
     * @see ROLE - UserDetailsServiceImpl
     */
	@RequestMapping(value = "/{login}",method = GET, produces = { APPLICATION_XML_VALUE, APPLICATION_JSON_VALUE })
    public ResponseEntity<String> getUsuario(@PathVariable("login") String login, @RequestHeader(value = IF_MODIFIED_SINCE, required = false) String dataAlteracao) {
		LOGGER.debug("GET USUARIO | Iniciado | Obtem o usuário. {}");
        LOGGER.debug("GET USUARIO | Identificador | Obtem o usuário. Identicador do usuário: {}, data alteracao: {}",login,dataAlteracao);
        LOGGER.debug("GET USUARIO | Concluído | Obtem o usuário. Identicador do usuário: {}, data alteracao: {}",login,dataAlteracao);
        return new ResponseEntity<>(OK);
    }

}
