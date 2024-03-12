package co.com.asulado.motorreglaslog.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.asulado.motorreglaslog.entity.Detallevalidacion;
import co.com.asulado.motorreglaslog.entity.Validacionidentidad;
import co.com.asulado.motorreglaslog.modelo.LogRequestDTO;
import co.com.asulado.motorreglaslog.modelo.LogResponseDTO;
import co.com.asulado.motorreglaslog.repository.ResultadoValidacionRepository;
import co.com.asulado.motorreglaslog.repository.SolicitanteRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LogServiceImpl implements LogServiceIface {

	@Autowired
	private DatosParticipanteServiceIface datosParticipante;
	@Autowired
	private InformacionTransaccionServiceIface informacionTransaccion;
	@Autowired
	private ResultadosConsultasListasServiceIface resultadoConsultaListas;
	@Autowired
	private ValidacionIdentidadServiceIface validacionIdentidadServ;
	@Autowired
	private DetalleValidacionServiceIface detalleValidacionServ;
	@Autowired
	private SolicitanteRepository solicitanteRepo;
	@Autowired
	private ResultadoValidacionRepository resultadoValidacionRepo;

	public LogResponseDTO crear(LogRequestDTO request) {

		LogResponseDTO logResponse = new LogResponseDTO();
		try {

			Detallevalidacion detalleValidaccion = new Detallevalidacion();

			if (request.getDatosParticipante() != null) {
				datosParticipante.save(request.getDatosParticipante());
				detalleValidaccion.setIddatosparticipante(request.getDatosParticipante().getIddatosparticipante());
			}

			if (request.getSolicitante() != null) {
				solicitanteRepo.save(request.getSolicitante());
				detalleValidaccion.setIdsolicitante(request.getSolicitante());
			}

			if (request.getInformaciontransaccion() != null) {
				informacionTransaccion.save(request.getInformaciontransaccion());
				detalleValidaccion.setIdinformaciontransaccion(request.getInformaciontransaccion());
			}

			if (request.getResultadoConsultaListas() != null) {
				logResponse
						.setResultadoConsultaListas(resultadoConsultaListas.save(request.getResultadoConsultaListas()));
				detalleValidaccion.setIdresultadosconsultaslistas(request.getResultadoConsultaListas());
			}

			if (request.getResultadoValidacion() != null) {
				logResponse.setResultadoValidacion(resultadoValidacionRepo.save(request.getResultadoValidacion()));
				detalleValidaccion.setIdresultadovalidacion(request.getResultadoValidacion());
			}

			// creación en la trabla Transaccion
			Validacionidentidad validacionIdentidad = new Validacionidentidad();
			// formato fecha -> dd:MM:yyyy
			Date fecha = request.getInformaciontransaccion().getFechahora();
			// formato hora -> HH:mm:ss
			validacionIdentidad.setFechahoracreacion(fecha);

			this.validacionIdentidadServ.save(validacionIdentidad);
			detalleValidaccion.setIdvalidacionidentidad(validacionIdentidad);
			logResponse.setIdValidacion(validacionIdentidad.getIdvalidacionidentidad());

			// Por ultimo se crea el detalle de validacion con los id generados
			detalleValidacionServ.save(detalleValidaccion);

		} catch (Exception e) {
			StringBuilder sb = new StringBuilder();
			sb.append(e.getCause());
			sb.append(" - ");
			sb.append(e.getMessage());
			sb.append(" - ");
			sb.append(e.getLocalizedMessage());
			logResponse.setError(sb.toString());
			log.warn("ERROR {}", e);
		}

		return logResponse;
	}

	@Override
	public Validacionidentidad actualizarSolicitud(Validacionidentidad validacionidentidad) {
		try {
			validacionidentidad = validacionIdentidadServ.update(validacionidentidad);
		} catch (Exception e) {
			StringBuilder sb = new StringBuilder();
			sb.append(e.getCause());
			sb.append(" - ");
			sb.append(e.getMessage());
			sb.append(" - ");
			sb.append(e.getLocalizedMessage());

			log.warn("ERROR {}", e);
		}
		return validacionidentidad;
	}
}
