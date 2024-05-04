package sn.ecpi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.ecpi.demo.entity.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {

}
