package mz.co.dsav1.DAO;

import java.util.List;
import mz.co.dsav1.model.Projecto;

public interface ProjectoDao {
		void save(Projecto c);
		void update(Projecto c);
		void delete(Long id);
		Projecto findById(Long id);
		List<Projecto> findAll();
	}



