package co.com.asulado.motorreglaslog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.asulado.motorreglaslog.entity.Validacionidentidad;
import co.com.asulado.motorreglaslog.modelo.LogRequestDTO;
import co.com.asulado.motorreglaslog.modelo.LogResponseDTO;
import co.com.asulado.motorreglaslog.service.LogServiceIface;

@RestController
@RequestMapping("/api/v1/logtransaccion")
public class LogController {

	@Autowired
	private LogServiceIface logService;
		
	@PostMapping
	public LogResponseDTO crear(@RequestBody LogRequestDTO request) {		
		return logService.crear(request);
	}
	
	@PutMapping
	public Validacionidentidad actualizarSolicitud(@RequestBody Validacionidentidad validacionidentidad) {
		return logService.actualizarSolicitud(validacionidentidad);
	} 
}
