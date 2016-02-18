package br.com.filme.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;

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
	
	@CrossOrigin(origins = "C:/Users/Desenv/Desktop/Coleta/")
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
	
	@CrossOrigin(origins = "C:/Users/Desenv/Desktop/Coleta/")
	@RequestMapping(value="/consultaTitulo", method = RequestMethod.GET)
	public ResponseEntity<String> consultaTitulo(String titulo){
		if(titulo == null)
			titulo = "";
		List<Filme> filmes = filmeRepository.findByTituloLike('%'+titulo+'%');
		System.out.println(filmes);
		JSONArray json = new JSONArray();
		JSONObject ob;
		for(int i=0; i <filmes.size(); i++){
			ob = new JSONObject(filmes.get(i));
			json.put(ob);
		}
		
		System.out.println(json.toString());
		try{
			return new ResponseEntity<String>(json.toString(), HttpStatus.OK);
			
		}catch(Exception e){
			return new ResponseEntity<String>(new Gson().toJson(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
