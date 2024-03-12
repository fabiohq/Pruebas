package co.com.asulado.motorreglaslog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.asulado.motorreglaslog.entity.Resultadovalidacion;
import co.com.asulado.motorreglaslog.repository.ResultadoValidacionRepository;

@Service
public class ResultadoValidacionServiceImpl implements ResultadoValidacionServiceIface{

	@Autowired
	private ResultadoValidacionRepository resultadoValidacionRepo;
	@Override
	public Resultadovalidacion findById(int idResultadoValidacion) throws Exception {
		return resultadoValidacionRepo.findById(idResultadoValidacion).get();
	}

	@Override
	public List<Resultadovalidacion> findAll() throws Exception {
		return resultadoValidacionRepo.findAll();
	}

	@Override
	public Resultadovalidacion save(Resultadovalidacion resultadoValidacion) throws Exception {
		return resultadoValidacionRepo.save(resultadoValidacion);
	}

	@Override
	public Resultadovalidacion update(Resultadovalidacion resultadoValidacion) throws Exception {
		return resultadoValidacionRepo.save(resultadoValidacion);
	}

	@Override
	public boolean delete(Resultadovalidacion resultadoValidacion) throws Exception {
		boolean delete = true;
		try {
			this.resultadoValidacionRepo.delete(resultadoValidacion);
		} catch (Exception e) {
			delete = false;
		}
		return delete;
	}

}
