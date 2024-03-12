package co.com.asulado.motorreglaslog.service;

import java.util.List;

import co.com.asulado.motorreglaslog.entity.Validacionidentidad;

public interface ValidacionIdentidadServiceIface {

	public Validacionidentidad findById(int idValidacionIdentidad)throws Exception;
	public List<Validacionidentidad> findAll()throws Exception;
	public Validacionidentidad save(Validacionidentidad validacionIdentidad)throws Exception;
	public Validacionidentidad update(Validacionidentidad validacionIdentidad)throws Exception;
	public boolean delete(Validacionidentidad validacionIdentidad)throws Exception;
}
