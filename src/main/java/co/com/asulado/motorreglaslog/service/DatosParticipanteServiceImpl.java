package co.com.asulado.motorreglaslog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.asulado.motorreglaslog.entity.Datosparticipante;
import co.com.asulado.motorreglaslog.repository.DatosParticipanteRepo;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DatosParticipanteServiceImpl implements DatosParticipanteServiceIface{

	@Autowired
	private DatosParticipanteRepo datosparticipante;
	
	@Override
	public Optional<Datosparticipante> findById(int idDatosParticipante) throws Exception{
		return datosparticipante.findById(idDatosParticipante);
	}
	
	@Override
	public List<Datosparticipante> findAll() throws Exception{
		return datosparticipante.findAll();
	}

	@Override
	public Datosparticipante save(Datosparticipante datosParticipante) throws Exception{
		return datosparticipante.save(datosParticipante);
	}

	@Override
	public Datosparticipante update(Datosparticipante datosParticipante) throws Exception{
		return datosparticipante.save(datosParticipante);
	}

	@Override
	public boolean delete(Datosparticipante datosParticipante) throws Exception{

		boolean delete = true;
		try {
			datosparticipante.delete(datosParticipante);
		} catch (Exception e) {
			delete = false;
		}
		
		return delete;
	}

	



}
