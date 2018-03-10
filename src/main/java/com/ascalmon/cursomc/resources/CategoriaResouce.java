package com.ascalmon.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Command shift o to import
@RequestMapping(value="/categorias")
public class CategoriaResouce {
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST esta funcionando";
	}
}
