package co.com.asulado.motorreglaslog.modelo;

import co.com.asulado.motorreglaslog.entity.Resultadosconsultaslistas;
import co.com.asulado.motorreglaslog.entity.Resultadovalidacion;
import lombok.Data;

@Data
public class LogResponseDTO {

	private String error;
	private int idValidacion;
	private Resultadosconsultaslistas resultadoConsultaListas;
	private Resultadovalidacion resultadoValidacion;
}
