package co.com.asulado.motorreglaslog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.asulado.motorreglaslog.entity.Solicitante;
import co.com.asulado.motorreglaslog.repository.SolicitanteRepository;

@Service
public class SolicitanteServiceImpl implements SolicitanteServiceIface{

	@Autowired
	SolicitanteRepository solicitanteRepo;
	@Override
	public Solicitante findById(int idSolicitante) throws Exception {
		return solicitanteRepo.findById(idSolicitante).get();
	}

	@Override
	public List<Solicitante> findAll() throws Exception {
		return solicitanteRepo.findAll();
	}

	@Override
	public Solicitante save(Solicitante solicitante) throws Exception {
		return solicitanteRepo.save(solicitante);
	}

	@Override
	public Solicitante update(Solicitante solicitante) throws Exception {
		return solicitanteRepo.save(solicitante);
	}

	@Override
	public boolean delete(Solicitante solicitante) throws Exception {
		boolean delete = true;
		try {
			this.solicitanteRepo.delete(solicitante);
		} catch (Exception e) {
			delete = false;
		}
		return delete;
	}

}
