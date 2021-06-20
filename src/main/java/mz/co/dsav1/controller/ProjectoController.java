package mz.co.dsav1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mz.co.dsav1.model.Projecto;
import mz.co.dsav1.service.ProjectoService;

@Controller
@RequestMapping("projectos")//link
public class ProjectoController {
	//private static final Object ModelMap  = null;
	@Autowired
	private ProjectoService service;
@GetMapping("/cadastrar") // esta no home no link
public String cadastrar()
{
	//ModelMap model =new ModelMap();
	//return new ModelAndView("projecto/cadastro").addObject("projectos",service.buscarTodos());
	//model.addAttribute("projectos", service.buscarTodos());
	return "projecto/cadastro"; //a pasta onde esta o file.
}


@GetMapping("/listar")
public String listar(ModelMap model)
{
	model.addAttribute("projectos", service.buscarTodos());
	//return  "/departamento/lista";
	return "/projecto/listar";
}
@PostMapping("/salvar")
public String salvar(Projecto p)
{
	service.salvar(p);
	return "redirect:/projectos/cadastrar";
}
}
