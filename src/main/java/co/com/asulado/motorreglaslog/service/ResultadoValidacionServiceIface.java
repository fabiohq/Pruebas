package co.com.asulado.motorreglaslog.service;

import java.util.List;

import co.com.asulado.motorreglaslog.entity.Resultadovalidacion;

public interface ResultadoValidacionServiceIface {

	public Resultadovalidacion findById(int idResultadoValidacion)throws Exception;
	public List<Resultadovalidacion> findAll()throws Exception;
	public Resultadovalidacion save(Resultadovalidacion resultadoValidacion)throws Exception;
	public Resultadovalidacion update(Resultadovalidacion resultadoValidacion)throws Exception;
	public boolean delete(Resultadovalidacion resultadoValidacion)throws Exception;
}
