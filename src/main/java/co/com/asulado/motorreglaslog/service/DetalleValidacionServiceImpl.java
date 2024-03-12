package co.com.asulado.motorreglaslog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.asulado.motorreglaslog.entity.Detallevalidacion;
import co.com.asulado.motorreglaslog.repository.DetalleValidacionRepository;

@Service
public class DetalleValidacionServiceImpl implements DetalleValidacionServiceIface{

	@Autowired
	private DetalleValidacionRepository detalleValidacionRepo;
	@Override
	public Detallevalidacion findById(int idDetalleTransacciones) throws Exception{
		return detalleValidacionRepo.findById(idDetalleTransacciones).get();
	}

	@Override
	public List<Detallevalidacion> findAll() throws Exception{
		return detalleValidacionRepo.findAll();
	}

	@Override
	public Detallevalidacion save(Detallevalidacion detalleTransacciones) throws Exception{
		return detalleValidacionRepo.save(detalleTransacciones);
	}

	@Override
	public Detallevalidacion update(Detallevalidacion detalleTransacciones) throws Exception{
		return detalleValidacionRepo.save(detalleTransacciones);
	}

	@Override
	public boolean delete(Detallevalidacion detalleTransacciones) throws Exception{
		boolean delete = true;
		try {
			detalleValidacionRepo.delete(detalleTransacciones);
		} catch (Exception e) {
			delete = false;
		}
		return delete;
	}

}
