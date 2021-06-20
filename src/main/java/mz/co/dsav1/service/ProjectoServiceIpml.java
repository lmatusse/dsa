package mz.co.dsav1.service;

//import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mz.co.dsav1.DAO.ProjectoDao;
import mz.co.dsav1.model.Projecto;
@Service @Transactional(readOnly = false)
public class ProjectoServiceIpml implements ProjectoService {
	@Autowired
	private ProjectoDao dao;
		@Override
		public void salvar(Projecto p) {
			p.setData_entrada(LocalDate.now());
			dao.save(p);
		}

		@Override
		public void editar(Projecto c) {
			dao.update(c);
		}

		@Override
		public void excluir(Long id) {
			dao.delete(id);
		}

		@Override @Transactional(readOnly = true)
		public Projecto buscarPorId(Long id) {
			return dao.findById(id);
		}

		@Override   @Transactional(readOnly = true)
		public List<Projecto> buscarTodos() {
			return dao.findAll();
		}

}
