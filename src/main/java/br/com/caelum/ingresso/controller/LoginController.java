package br.com.caelum.ingresso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.caelum.ingresso.dao.UsuarioDao;

@Controller
public class LoginController {
	
	@Autowired
	private UsuarioDao dao;
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
}
