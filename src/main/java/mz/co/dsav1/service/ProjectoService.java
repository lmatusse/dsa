package mz.co.dsav1.service;

import java.util.List;

import mz.co.dsav1.model.Projecto;

public interface ProjectoService {
	void salvar(Projecto c);
	void editar(Projecto c);
	void excluir(Long id);
	Projecto buscarPorId(Long id);
	List<Projecto> buscarTodos();
}
