package co.com.asulado.motorreglaslog.service;

import java.util.List;

import co.com.asulado.motorreglaslog.entity.Detallevalidacion;

public interface DetalleValidacionServiceIface {

	public Detallevalidacion findById(int idDetalleTransacciones)throws Exception;
	public List<Detallevalidacion> findAll()throws Exception;
	public Detallevalidacion save(Detallevalidacion detalleTransacciones)throws Exception;
	public Detallevalidacion update(Detallevalidacion detalleTransacciones)throws Exception;
	public boolean delete(Detallevalidacion detalleTransacciones)throws Exception;
}
