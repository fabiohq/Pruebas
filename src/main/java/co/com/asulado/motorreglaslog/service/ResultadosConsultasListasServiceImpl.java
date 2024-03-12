package co.com.asulado.motorreglaslog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.asulado.motorreglaslog.entity.Resultadosconsultaslistas;
import co.com.asulado.motorreglaslog.repository.ResultadoConsultaListasRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ResultadosConsultasListasServiceImpl implements ResultadosConsultasListasServiceIface{

	@Autowired
	private ResultadoConsultaListasRepository resultadoConsultaListas;
	@Override
	public Optional<Resultadosconsultaslistas> findById(int idResultadoConsultaListas) throws Exception{
		return resultadoConsultaListas.findById(idResultadoConsultaListas);
	}
	@Override
	public List<Resultadosconsultaslistas> findAll() throws Exception{
		return resultadoConsultaListas.findAll();
	}
	@Override
	public Resultadosconsultaslistas save(Resultadosconsultaslistas resultadosConsultaListas) throws Exception{
		return resultadoConsultaListas.save(resultadosConsultaListas);
	}
	@Override
	public Resultadosconsultaslistas update(Resultadosconsultaslistas resultadosConsultaListas) throws Exception{
		return resultadoConsultaListas.save(resultadosConsultaListas);
	}
	@Override
	public boolean delete(Resultadosconsultaslistas resultadosConsultaListas) throws Exception{
		boolean delete = true;
		try {
			resultadoConsultaListas.delete(resultadosConsultaListas);
		} catch (Exception e) {
			delete = false;
		}
		return delete;
	}

}
