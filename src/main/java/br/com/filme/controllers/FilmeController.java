package br.com.filme.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.filme.models.Filme;
import br.com.filme.repositories.FilmeRepository;

@Controller
@Transactional
public class FilmeController {

	@Autowired
	FilmeRepository filmeRepository;
	
	@RequestMapping("/saveFilme")
	public ResponseEntity<String> saveFilme(Filme filme){
		System.out.println(filme.toString());
		filmeRepository.save(filme);
		try{
			return new ResponseEntity<String>("Ok", HttpStatus.CREATED);
		}catch(Exception e){
			return new ResponseEntity<String>("Erro", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping("/findOne")
	public ResponseEntity<String> editFilme(String id){
		Filme filme = filmeRepository.findOne(Long.parseLong(id));
		System.out.println(filme.toString());
		try{
			return new ResponseEntity<String>(new ObjectMapper().writeValueAsString(filme), HttpStatus.CREATED);
		}catch(Exception e){
			return new ResponseEntity<String>("Erro", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping("/deletaFilme")
	public ResponseEntity<String> deletaFilme(String id){
		System.out.println();
		filmeRepository.delete(Long.parseLong(id));
		try{
			return new ResponseEntity<String>("Ok", HttpStatus.CREATED);
		}catch(Exception e){
			return new ResponseEntity<String>("Erro", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value="/consultaTitulo", method = RequestMethod.GET)
	public ResponseEntity<String> consultaTitulo(String titulo){
		if(titulo == null)
			titulo = "";
		List<Filme> filmes = filmeRepository.findByTituloLike('%'+titulo+'%');
		System.out.println(filmes);
		try{
			return new ResponseEntity<String>(new ObjectMapper().writeValueAsString(filmes), HttpStatus.CREATED);
		}catch(Exception e){
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
