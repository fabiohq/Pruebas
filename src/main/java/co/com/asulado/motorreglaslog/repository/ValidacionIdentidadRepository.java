package co.com.asulado.motorreglaslog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.asulado.motorreglaslog.entity.Validacionidentidad;

@Repository
public interface ValidacionIdentidadRepository extends JpaRepository<Validacionidentidad, Integer>{

}
