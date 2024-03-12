package co.com.asulado.motorreglaslog.service;

import java.util.List;

import co.com.asulado.motorreglaslog.entity.Solicitante;

public interface SolicitanteServiceIface {

	public Solicitante findById(int idSolicitante)throws Exception;
	public List<Solicitante> findAll()throws Exception;
	public Solicitante save(Solicitante solicitante)throws Exception;
	public Solicitante update(Solicitante solicitante)throws Exception;
	public boolean delete(Solicitante solicitante)throws Exception;
}
