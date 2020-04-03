package com.synchro.hotel.hotel.repository;


import com.synchro.hotel.hotel.models.hotel;

import org.springframework.data.repository.CrudRepository;



public interface hotelRepository extends CrudRepository<hotel, Integer>{
   /*  @Query(value = "SELECT u FROM voos where u.cidade=?1")
    ListFilter Iterable<hotel> findByEmployeeName(String cidade);       */
//CRIAR FUNCAO PARA LISTAR POR NOME DE CIDADE
//TROCAR POST POR GET EM FILTRAGEM DE VOOS
}