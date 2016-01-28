package br.com.filme.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.filme.models.Filme;

@Repository
public interface FilmeRepository extends CrudRepository<Filme, Long>{
	
	public List<Filme> findByTituloLike(String titulo);
}
