package co.com.asulado.motorreglaslog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.asulado.motorreglaslog.entity.Detallevalidacion;
@Repository
public interface DetalleValidacionRepository extends JpaRepository<Detallevalidacion, Integer>{

}
