package mz.co.dsav1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("projectos")//link
public class ProjectoController {
@GetMapping("/cadastrar") // esta no home no link
public String cadastrar()
{
	return "projecto/cadastro"; //a pasta onde esta o file.
}
@GetMapping("/listar")
public String listar()
{
	return "/projecto/listar";
}
}
