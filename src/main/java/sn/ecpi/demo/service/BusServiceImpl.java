package sn.ecpi.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sn.ecpi.demo.entity.Bus;
import sn.ecpi.demo.repository.BusRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class BusServiceImpl implements BusService {
    private final BusRepository busRepository;
    @Override
    public Bus creer(Bus bus) {
        return busRepository.save(bus);
    }

    @Override
    public List<Bus> lire() {
        return busRepository.findAll();
    }

    @Override
    public Bus modifier(Long id, Bus bus) {
        return busRepository.findById(id)
                .map(b ->{
                    b.setModele(bus.getModele());
                    b.setDescription(bus.getDescription());
                    b.setKilometrage(bus.getKilometrage());
                    b.setAnneeFabrication(bus.getAnneeFabrication());
                    b.setCapacitePassagers(bus.getCapacitePassagers());
                    return busRepository.save(b);
                }).orElseThrow(()-> new RuntimeException("Bus non trouvé"));
    }

    @Override
    public String supprimer(long id) {
        busRepository.deleteById(id);
        return "Bus supprmé avec succcès" ;
    }
}
