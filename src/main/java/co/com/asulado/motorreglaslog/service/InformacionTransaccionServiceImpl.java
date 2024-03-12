package co.com.asulado.motorreglaslog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.asulado.motorreglaslog.entity.Informaciontransaccion;
import co.com.asulado.motorreglaslog.repository.InformacionTransaccionRepo;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class InformacionTransaccionServiceImpl implements InformacionTransaccionServiceIface{

	@Autowired
	private InformacionTransaccionRepo informaciontransaccion;
	@Override
	public Optional<Informaciontransaccion> findById(int idInformacionTransaccion) throws Exception{
		return informaciontransaccion.findById(idInformacionTransaccion);
	}

	@Override
	public List<Informaciontransaccion> findAll() throws Exception{
		return informaciontransaccion.findAll();
	}

	@Override
	public Informaciontransaccion save(Informaciontransaccion informacionTransaccion) throws Exception{
		return informaciontransaccion.save(informacionTransaccion);
	}

	@Override
	public Informaciontransaccion update(Informaciontransaccion informacionTransaccion) throws Exception{
		return informaciontransaccion.save(informacionTransaccion);
	}

	@Override
	public boolean delete(Informaciontransaccion informacionTransaccion) throws Exception{
		boolean delete = true;
		try {
			informaciontransaccion.delete(informacionTransaccion);
		} catch (Exception e) {
			delete = false;
		}
		return delete;
	}

}
