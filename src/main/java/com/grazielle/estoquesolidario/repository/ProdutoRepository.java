package com.grazielle.estoquesolidario.repository;


import com.grazielle.estoquesolidario.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}



