/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.campitos.fin;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author campitos
 */
public interface RepositorioMensaje 
        extends MongoRepository<Mensaje,String>{
    
}
