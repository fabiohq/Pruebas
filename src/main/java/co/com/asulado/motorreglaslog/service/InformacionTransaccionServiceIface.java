package co.com.asulado.motorreglaslog.service;

import java.util.List;
import java.util.Optional;

import co.com.asulado.motorreglaslog.entity.Informaciontransaccion;

public interface InformacionTransaccionServiceIface {

	public Optional<Informaciontransaccion> findById(int idInformacionTransaccion)throws Exception;
	public List<Informaciontransaccion> findAll()throws Exception;
	public Informaciontransaccion save(Informaciontransaccion informacionTransaccion)throws Exception;
	public Informaciontransaccion update(Informaciontransaccion informacionTransaccion)throws Exception;
	public boolean delete(Informaciontransaccion informacionTransaccion)throws Exception;
}
