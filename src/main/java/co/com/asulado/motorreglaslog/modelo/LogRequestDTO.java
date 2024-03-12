package co.com.asulado.motorreglaslog.modelo;

import org.springframework.stereotype.Component;

import co.com.asulado.motorreglaslog.entity.Datosparticipante;
import co.com.asulado.motorreglaslog.entity.Informaciontransaccion;
import co.com.asulado.motorreglaslog.entity.Resultadosconsultaslistas;
import co.com.asulado.motorreglaslog.entity.Resultadovalidacion;
import co.com.asulado.motorreglaslog.entity.Solicitante;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LogRequestDTO {

	private Datosparticipante datosParticipante;
	private Solicitante solicitante;
	private Informaciontransaccion informaciontransaccion;
	private Resultadosconsultaslistas resultadoConsultaListas;
	private Resultadovalidacion resultadoValidacion;
}
