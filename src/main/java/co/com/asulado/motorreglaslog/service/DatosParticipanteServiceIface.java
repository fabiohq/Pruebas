package co.com.asulado.motorreglaslog.service;

import java.util.List;
import java.util.Optional;

import co.com.asulado.motorreglaslog.entity.Datosparticipante;


public interface DatosParticipanteServiceIface {

	public Optional<Datosparticipante> findById(int idDatosParticipante) throws Exception;
	public List<Datosparticipante> findAll()throws Exception;
	public Datosparticipante save(Datosparticipante datosParticipante)throws Exception;
	public Datosparticipante update(Datosparticipante datosParticipante)throws Exception;
	public boolean delete(Datosparticipante datosParticipante)throws Exception;
	
}
