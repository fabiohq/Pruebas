package co.com.asulado.motorreglaslog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.asulado.motorreglaslog.entity.Validacionidentidad;
import co.com.asulado.motorreglaslog.repository.ValidacionIdentidadRepository;

@Service
public class ValidacionIdentidadServiceImpl implements ValidacionIdentidadServiceIface{

	@Autowired
	private ValidacionIdentidadRepository validacionIdentidadRepo;
	@Override
	public Validacionidentidad findById(int idValidacionIdentidad) throws Exception{
		return this.validacionIdentidadRepo.findById(idValidacionIdentidad).get();
	}

	@Override
	public List<Validacionidentidad> findAll() throws Exception{
		return this.findAll();
	}

	@Override
	public Validacionidentidad save(Validacionidentidad validacionIdentidad) throws Exception{
		return this.validacionIdentidadRepo.save(validacionIdentidad);
	}

	@Override
	public Validacionidentidad update(Validacionidentidad validacionIdentidad) throws Exception{
		Validacionidentidad temp = findById(validacionIdentidad.getIdvalidacionidentidad());		
		validacionIdentidad.setFechahoracreacion(temp.getFechahoracreacion());
		return this.validacionIdentidadRepo.save(validacionIdentidad);
	}

	@Override
	public boolean delete(Validacionidentidad validacionIdentidad) throws Exception{
		boolean delete = true;
		try {
			this.validacionIdentidadRepo.delete(validacionIdentidad);
		} catch (Exception e) {
			delete = false;
		}
		return delete;
	}

}
