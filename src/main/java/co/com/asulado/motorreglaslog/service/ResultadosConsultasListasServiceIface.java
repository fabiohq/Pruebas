package co.com.asulado.motorreglaslog.service;

import java.util.List;
import java.util.Optional;

import co.com.asulado.motorreglaslog.entity.Resultadosconsultaslistas;

public interface ResultadosConsultasListasServiceIface {

	public Optional<Resultadosconsultaslistas> findById(int idResultadosConsultaListas)throws Exception;
	public List<Resultadosconsultaslistas> findAll()throws Exception;
	public Resultadosconsultaslistas save(Resultadosconsultaslistas resultadosConsultaListas)throws Exception;
	public Resultadosconsultaslistas update(Resultadosconsultaslistas resultadosConsultaListas)throws Exception;
	public boolean delete(Resultadosconsultaslistas resultadosConsultaListas)throws Exception;
}
