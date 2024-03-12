package co.com.asulado.motorreglaslog.service;

import co.com.asulado.motorreglaslog.entity.Validacionidentidad;
import co.com.asulado.motorreglaslog.modelo.LogRequestDTO;
import co.com.asulado.motorreglaslog.modelo.LogResponseDTO;

public interface LogServiceIface {

	public LogResponseDTO crear(LogRequestDTO request);
	
	public Validacionidentidad actualizarSolicitud(Validacionidentidad validacionidentidad);
	
}
